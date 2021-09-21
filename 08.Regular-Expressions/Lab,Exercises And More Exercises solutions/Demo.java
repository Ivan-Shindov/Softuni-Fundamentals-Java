import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        Pattern firstPattern = Pattern.compile("([#$%*&])(?<capitals>[A-Z]+)(\\1)");
        Matcher firstMatcher = firstPattern.matcher(firstPart);

        String capitalLetters = "";
        while (firstMatcher.find()) {
            String current = firstMatcher.group("capitals");
            capitalLetters = current.substring(0, current.length());
        }

        for (int i = 0; i < capitalLetters.length(); i++) {
            char startLetter = capitalLetters.charAt(i);

            Pattern secondPattern = Pattern.compile("\\{"+ startLetter +"\\}(:)(?<length>[0-9][0-9])");
            Matcher secondMatcher = secondPattern.matcher(secondPart);
            String fd = secondMatcher.group("length");
            int length = Integer.parseInt(fd);

            Pattern thirdPattern = Pattern.compile("(?<=\\s|^)\\{" + startLetter + "\\}" +
                    "[^\\s]\\{" + length + "\\}(?=\\s|$)");
            Matcher thirdMatcher = thirdPattern.matcher(thirdPart);
            String word = thirdMatcher.toString();

            System.out.println(word);
        }
    }
}
