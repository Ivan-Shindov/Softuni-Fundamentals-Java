import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = getMultipleOfEvenAndOdds(number);
        System.out.println(Math.abs(result));
    }

    private static int getMultipleOfEvenAndOdds(int number) {
        int evenSum = getEvenDigitsSum(number);
        int oddSum = getOddsDigitsSum(number);

        return evenSum * oddSum;
    }

    private static int getOddsDigitsSum(int number) {
        int result = 0;

        while (number !=0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                result += lastDigit;
            }
            number -= lastDigit;
            number /= 10;
        }

        return result;
    }

    private static int getEvenDigitsSum(int number) {
        int result = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                result += lastDigit;
            }
            number -= lastDigit;
            number /= 10;

        }
        return result;
    }
}
