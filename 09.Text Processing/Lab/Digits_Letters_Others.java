
import java.util.Scanner;

public class Digits_Letters_Others {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char sign = text.charAt(i);
            if (Character.isDigit(sign)) {
                digits.append(sign);
            } else if (Character.isLetter(sign)) {
                letters.append(sign);
            } else {
                symbols.append(sign);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(symbols.toString());
    }
}
