import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");

        for (String word : words) {
            if (isValidWord(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isValidWord(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                return false;
            }
        }
        return true;
    }
}
