import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, Map<String, Integer>> user = new TreeMap<>();

        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contestName = tokens[0];
            String password = tokens[1];

            if (!contests.containsKey(contestName)) {
                contests.put(contestName, password);
            } else {
                contests.put(contestName, password);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contestName = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contestName)) {
                if (contests.get(contestName).equals(password)) {

                    LinkedHashMap<String, Integer> courses = new LinkedHashMap<>();
                    courses.put(contestName, points);

                    if (!user.containsKey(username)) {
                        user.put(username, courses);

                    } else {
                        if (!user.get(username).containsKey(contestName)) {
                            user.get(username).put(contestName, points);
                        } else {
                            user.get(username).put(contestName,
                                    Math.max(points, user.get(username).get(contestName)));
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : user.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(p -> p).sum();
            if (sum > totalSum) {
                totalSum = sum;

            }
        }
        for (Map.Entry<String, Map<String, Integer>> entry : user.entrySet()) {
            if (entry.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.println(String.format("Best candidate is %s with total %d points.",
                        entry.getKey(), totalSum));
            }
        }

        System.out.printf("Ranking: %n");
        user.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet()
                    .stream()
                    .sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                    .forEach(i -> System.out.println(String.format("#  %s -> %d",
                            i.getKey(), i.getValue())));
        });
    }
}
