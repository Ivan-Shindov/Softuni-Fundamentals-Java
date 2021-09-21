import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = (char) (text.charAt(i) + 3);
            result.append(symbol);
        }
        System.out.println(result);
    }
}
