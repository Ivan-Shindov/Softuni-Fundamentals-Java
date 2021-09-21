import java.util.Scanner;

public class Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberString = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
        if (multiplier == 0) {
            System.out.println(0);
            return;
        }

        while (numberString.charAt(0) == '0') {
            numberString = numberString.substring(1);
        }
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        for (int i = numberString.length() -1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            int product = digit * multiplier + reminder;
            result.append(product % 10);
            reminder = product / 10;
        }
        if (reminder != 0) {
            result.append(reminder);
        }

        System.out.println(result.reverse());
    }
}
