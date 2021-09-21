import java.util.ArrayList;
        import java.util.LinkedHashMap;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        LinkedHashMap<String, Integer> participants = new LinkedHashMap<>();
        for (String name : input) {
            participants.put(name, 0);
        }

        String line = scanner.nextLine();

        while (!line.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            int result = 0;

            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                name.append(matcher.group());
            }

            Pattern patternDigits = Pattern.compile("\\d");
            Matcher matcherDigits = patternDigits.matcher(line);
            while (matcherDigits.find()) {
                result += Integer.parseInt(matcherDigits.group());
            }

            if (participants.containsKey(String.valueOf(name))) {
                participants.put(String.valueOf(name),
                        participants.get(String.valueOf(name)) + result);
            }

            line = scanner.nextLine();
        }
        List<String> players = new ArrayList<>();
        participants.entrySet().stream()
                .sorted((p1,p2) -> Integer.compare(p2.getValue(),p1.getValue()))
                .limit(3)
                .forEach(p -> players.add(p.getKey()));

        System.out.printf("1st place: %s%n" +
                "2nd place: %s%n" +
                "3rd place: %s%n",players.get(0), players.get(1), players.get(2));
    }
}
