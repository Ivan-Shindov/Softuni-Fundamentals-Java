import java.util.*;

public class MOBA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> playerStats = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Season end")) {
                break;
            }

            List<String> SplitedNewPlayers = new ArrayList<>();
            List<String> playerVSplayer = new ArrayList<>();
            String player = null;
            String position = null;
            int skill = 0;

            if (input.contains("->")) {
                SplitedNewPlayers = Arrays.asList(input.split(" -> "));
                player = SplitedNewPlayers.get(0);
                position = SplitedNewPlayers.get(1);
                skill = Integer.parseInt(SplitedNewPlayers.get(2));

                if (!playerStats.containsKey(player)) {
                    playerStats.put(player, new TreeMap<>());
                }
                if (!playerStats.get(player).containsKey(position)) {
                    playerStats.get(player).put(position, 0);
                }
                if (playerStats.get(player).get(position) <= skill) {
                    playerStats.get(player).put(position, skill);
                }

            } else {
                playerVSplayer = Arrays.asList(input.split(" vs "));
                String firstPlayer = playerVSplayer.get(0);
                String secondPlayer = playerVSplayer.get(1);

                TreeMap<String, Integer> map1 = playerStats.get(firstPlayer);
                TreeMap<String, Integer> map2 = playerStats.get(secondPlayer);

                if (playerStats.containsKey(firstPlayer) && playerStats.containsKey(secondPlayer)) {
                    String playerToRemove = "";
                    for (Map.Entry<String, Integer> role : map1.entrySet()) {
                        for (Map.Entry<String, Integer> pos : map2.entrySet()) {

                            if (role.getKey().equals(pos.getKey())) {

                                if (map1.values().stream().mapToInt(Integer::intValue).sum() >
                                        map2.values().stream().mapToInt(Integer::intValue).sum()) {
                                    playerToRemove = secondPlayer;

                                } else if (map1.values().stream().mapToInt(Integer::intValue).sum() <
                                        map2.values().stream().mapToInt(Integer::intValue).sum()) {
                                    playerToRemove = firstPlayer;
                                }
                            }
                        }
                    }
                    playerStats.remove(playerToRemove);
                }
            }
        }
        playerStats.entrySet()
                .stream()
                .sorted((x1, x2) -> x2.getValue().values().stream().mapToInt(Integer::intValue).sum() -
                        x1.getValue().values().stream().mapToInt(Integer::intValue).sum())
                .forEach(p -> {
                    System.out.println(String.format("%s: %d skill",
                            p.getKey(),
                            p.getValue()
                                    .values()
                                    .stream()
                                    .mapToInt(Integer::intValue).sum()));
                    p.getValue().entrySet().stream().sorted((x1, x2) -> Integer.compare(x2.getValue(), x1.getValue()))
                            .forEach(x -> System.out.println(String.format("- %s <::> %d",
                                    x.getKey(),
                                    x.getValue())));
                });
    }
}
