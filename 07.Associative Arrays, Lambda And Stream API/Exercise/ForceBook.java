import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String, ArrayList<String>> forceUsers = new TreeMap<>();

        while(!input.equals("Lumpawaroo")) {
            String[] tokens;
            String user;
            String forceSide;

            if (input.contains("|")) {
                tokens = input.split(" \\| ");
                forceSide = tokens[0];
                user = tokens[1];

                boolean check = false;

                for(Map.Entry<String, ArrayList<String>> entry : forceUsers.entrySet()){
                    if(entry.getValue().contains(user)){
                        check = true;
                        break;
                    }
                }

                if(!check){
                    if(!forceUsers.containsKey(forceSide)){
                        forceUsers.put(forceSide, new ArrayList<>());
                        forceUsers.get(forceSide).add(user);
                    }
                    else if(forceUsers.containsKey(forceSide) && !forceUsers.get(forceSide).contains(user)){
                        forceUsers.get(forceSide).add(user);
                    }
                }

            } else if (input.contains("->")) {
                tokens = input.split(" -> ");
                user = tokens[0];
                forceSide = tokens[1];

                for (Map.Entry<String, ArrayList<String>> entry : forceUsers.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        forceUsers.get(entry.getKey()).remove(user);
                        break;
                    }
                }

                if (!forceUsers.containsKey(forceSide)) {
                    forceUsers.put(forceSide, new ArrayList<>());
                    forceUsers.get(forceSide).add(user);
                    System.out.printf("%s joins the %s side!%n", user, forceSide);
                }
                else if (forceUsers.containsKey(forceSide) && !forceUsers.get(forceSide).contains(user)) {
                    forceUsers.get(forceSide).add(user);
                    System.out.printf("%s joins the %s side!%n", user, forceSide);
                }
            }

            input = scanner.nextLine();
        }

        forceUsers.entrySet()
                .stream()
                .filter(u -> u.getValue().size() > 0)
                .sorted((x1,x2) -> Integer.compare(x2.getValue().size(),x1.getValue().size()))
                .forEach(u -> {
                    System.out.println(String.format("Side: %s, Members: %d"
                            , u.getKey()
                            , u.getValue().size()));
                    u.getValue()
                            .stream()
                            .sorted((x1,x2) -> x1.compareTo(x2))
                            .forEach(p -> System.out.printf("! %s%n", p));
                });
    }
}
