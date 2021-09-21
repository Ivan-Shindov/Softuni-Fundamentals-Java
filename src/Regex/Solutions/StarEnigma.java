import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        Pattern pattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int count = 0;
            StringBuilder text = new StringBuilder();

            Matcher matcher = pattern.matcher(input);

            for (int j = 0; j < input.length(); j++) {
                if (matcher.find()) {
                    count++;
                }
            }

            for (int j = 0; j < input.length(); j++) {
                char sym = (char) (input.charAt(j) - count);
                text.append(sym);
            }

            Pattern pattern1 = Pattern.compile("@(?<planet>([a-zA-Z]+))" +
                    "[^@\\-!:>]*:[0-9]+[^@\\-!:>]*!(?<attack>([AD]))![^@\\-!:>]*->[0-9]+");

            //\\@([^\\@\\-\\!\\:\\>]*)(?<name>[A-Z][a-z]*)" +
            //                    "[^0-](\\1)\\:(?<pop>[0-9]*)" +
            //                    "(\\1)\\!(?<type>[AD])\\!(\\1)\\-\\>\\d++

            //@([a-zA-Z]+)[^@\-!:>]*:[0-9]+[^@\-!:>]*!([AD])![^@\-!:>]*->[0-9]+

            //.*?(?<planet>[A-Z][a-z]+)(?:[^@\\-!:>]*):(?<population>(\\d)+)" +
            //                    "(?:[^@\\-!:>]*)!(?<attack>[AD])!(?:[^@\\-!:>]*)->(?<soldierCount>\\d+)

            Matcher matcher1 = pattern1.matcher(text);

            while (matcher1.find()) {
                String planetName = matcher1.group("planet");
                String attackType = matcher1.group("attack");

                if (attackType.equals("A")) {
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }
            }
        }

        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }

}