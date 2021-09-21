import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {
            String replaceSym = replacement(words[i]);
            text = text.replace(words[i],replaceSym);
        }
        System.out.println(text);
    }

    private static String replacement(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += '*';
        }
        return result;
    }

}
