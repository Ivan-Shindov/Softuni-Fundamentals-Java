import java.util.*;

public class DemoInMapsLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> players = new HashMap<>();  // player and position
        Map<String, Integer> positionSkill = new HashMap<>(); // position and skill

        while (!input.equals("Season end")) {
            if (input.contains(" -> ")) {
                String[] tokens = input.split(" -> ");
                String playerName = tokens[0];
                String playerPosition = tokens[1];
                int skill = Integer.parseInt(tokens[2]);

                if (!players.containsKey(playerName)) {
                    players.put(playerName, new ArrayList<>());
                    players.get(playerName).add(playerPosition);
                    positionSkill.put(playerPosition, skill);

                } else {
                    players.get(playerName).add(playerPosition);
                    positionSkill.put(playerPosition, 0);
                    if (positionSkill.get(playerPosition) < skill) {
                        positionSkill.put(playerPosition, skill);
                    }
                }

            } else if (input.contains(" vs ")) {
                String[] tokens = input.split(" vs ");
                String firstPlayer = tokens[0];
                String secondPlayer = tokens[1];
            }

            input = scanner.nextLine();
        }
    }
}