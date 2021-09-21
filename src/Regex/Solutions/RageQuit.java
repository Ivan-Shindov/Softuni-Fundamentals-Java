import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("(?<string>[\\D]*)(?<digit>[\\d]+)");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String text = matcher.group("string").toUpperCase();
            int num = Integer.parseInt(matcher.group("digit"));

            for (int i = 0; i < num; i++) {
                result.append(text);
            }
        }

        System.out.printf("Unique symbols used: %d%n", result.chars().distinct().count());
        System.out.printf("%s%n", result);
    }
}
