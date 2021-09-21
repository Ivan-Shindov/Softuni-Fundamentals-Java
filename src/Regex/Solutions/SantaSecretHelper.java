import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        ArrayList<String> kids = new ArrayList<>();

        while (!line.equals("end")) {
            StringBuilder text = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                symbol = (char) (symbol - key);
                text.append(symbol);
            }

            //@(?<name>[A-Z]*[a-z]*)([^-@!\:>]*)?(?<behaviour>![G]!)

            Pattern pattern =Pattern.compile("@(?<name>[A-Za-z]*)([^-@!\\:>]*)(?<behaviour>![G]!)");
            Matcher matcherText = pattern.matcher(text.toString());

            if (matcherText.find()) {
                String name = matcherText.group("name");
                kids.add(name);
            }

            line = scanner.nextLine();
        }

        for (String kid : kids) {
            System.out.println(kid);
        }
    }
}
