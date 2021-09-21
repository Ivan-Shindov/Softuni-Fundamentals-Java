import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^|\\s[a-z0-9][\\.\\_\\-a-z0-9]*[a-z0-9]@[a-z0-9]" +
                "[\\.\\-a-z0-9]*[a-z0-9]\\.[a-z]{2,}");

        Matcher matcher = pattern.matcher(input);

        //(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([a-zA-z0-9]+)@([a-zA-Z]+([\\.\\-][A-Za-z]+)+))\\b

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
