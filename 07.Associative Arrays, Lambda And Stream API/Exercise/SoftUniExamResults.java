import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> studentAndResult = new TreeMap<>();
        Map<String, List<Integer>> languageSubmissions = new HashMap<>();

        while (!line.equals("exam finished")) {
            String[] tokens = line.split("-");
            String studentName = tokens[0];

            if (!tokens[1].equals("banned")) {
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if (!studentAndResult.containsKey(studentName)) {
                    studentAndResult.put(studentName, points);

                } else if (studentAndResult.get(studentName) < points) {
                    studentAndResult.put(studentName, points);
                }
//                studentAndResult.putIfAbsent(studentName, 0);
//                studentAndResult.put(studentName, points);

                languageSubmissions.putIfAbsent(language, new ArrayList<>());
                languageSubmissions.get(language).add(1);

            } else {
                studentAndResult.remove(studentName);
            }

            line = scanner.nextLine();
        }

        System.out.println("Results:");
        studentAndResult.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e ->
                        System.out.println(String.format("%s | %d",
                                e.getKey(),
                                e.getValue())));
        System.out.println("Submissions:");
        languageSubmissions.entrySet()
                .stream()
                .sorted((p1, p2) -> Integer.compare(p2.getValue().size()
                        , p1.getValue().size()))
                .sorted((p1, p2) -> p1.getKey().compareTo(p2.getKey()))
                .forEach(e ->
                        System.out.println(String.format("%s - %d",
                                e.getKey(),
                                e.getValue().size())));

    }
}
