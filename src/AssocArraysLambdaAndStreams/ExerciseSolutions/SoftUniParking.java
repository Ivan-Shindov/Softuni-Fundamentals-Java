import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,String> registeredUsers = new LinkedHashMap<>();

        for (int i = 0; i < numOfCommands; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            if (command.equals("register")) {
                String plateNumber = tokens[2];
                if (!registeredUsers.containsKey(name)) {
                    registeredUsers.put(name, plateNumber);
                    System.out.println(String.format("%s registered %s successfully", name, plateNumber));

                } else {
                    System.out.println(String.format("ERROR: already registered with plate number %s",plateNumber));
                }

            } else {
                if (registeredUsers.containsKey(name)) {
                    System.out.println(String.format("%s unregistered successfully", name));
                    registeredUsers.remove(name);
                } else {
                    System.out.println(String.format("ERROR: user %s not found", name));
                }
            }
        }
        registeredUsers
                .entrySet()
                .forEach(e -> System.out.println(String.format("%s => %s", e.getKey(), e.getValue())));
    }
}
