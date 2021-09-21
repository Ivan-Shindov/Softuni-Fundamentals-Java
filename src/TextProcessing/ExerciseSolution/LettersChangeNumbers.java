import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0.0;

        for (int i = 0; i < input.length; i++) {

            String text = String.valueOf(input[i]);
            int number = Integer.parseInt(text.substring(1, text.length() - 1));
            char firstChar = text.charAt(0);
            char lastChar = text.charAt(text.length() - 1);

            double result = 0.0;

            if (Character.isUpperCase(firstChar)) {
                result = number * 1.0 / (firstChar - 64);
            } else {
                result = number * 1.0 * (firstChar - 96);
            }

            if (Character.isUpperCase(lastChar)) {
                result -= (lastChar - 64);
            } else {
                result += (lastChar - 96);
            }
            totalSum += result;
        }

        System.out.printf("%.2f%n", totalSum);
    }
}
