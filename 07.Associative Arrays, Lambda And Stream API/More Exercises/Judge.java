import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> contest = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contestName = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            if (!contest.containsKey(contestName)) {
                contest.put(contestName, new LinkedHashMap<>());
                contest.get(contestName).put(username, points);
            } else {
                if (contest.get(contestName).containsKey(username)) {
                    if (contest.get(contestName).get(username) < points) {
                        contest.get(contestName).put(username, points);
                    }

                } else {
                    contest.get(contestName).put(username, points);
                }
            }
            input = scanner.nextLine();
        }

        AtomicInteger num = new AtomicInteger();

        contest.entrySet()
                .stream()
                .forEach(x -> {
                    System.out.println(String.format("%s: %d participants",
                            x.getKey(),
                            x.getValue().size()));
                    num.set(1);
                    Map<String, Integer> students = new HashMap<>();
                    x.getValue()
                            .entrySet()
                            .stream()
                            .sorted((k2, k1) -> {
                                int sort = Integer.compare(k1.getValue(), k2.getValue());
                                if (sort == 0) {
                                    sort = k2.getKey().compareTo(k1.getKey());

                                }
                                return sort;
                            }).forEach(s -> System.out.println(String.format("%d. %s <::> %d",
                            num.getAndIncrement(), s.getKey(), s.getValue())));
                });

        Map<String, Integer> standings = new LinkedHashMap<>();

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : contest.entrySet()) {
            for (Map.Entry<String, Integer> map : entry.getValue().entrySet()) {
                standings.putIfAbsent(map.getKey(), 0);
                standings.put(map.getKey(), standings.get(map.getKey()) + map.getValue());
            }
        }

        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });
    }
}
