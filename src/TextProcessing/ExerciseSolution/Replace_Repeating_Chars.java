import java.util.Scanner;

public class Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        char baseLetter = input.charAt(0);
        result.append(baseLetter);
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (baseLetter != current) {
                result.append(current);
                baseLetter = current;
            }
        }

        System.out.println(result);
    }
}
