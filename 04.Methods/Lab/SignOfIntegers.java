import java.util.Scanner;

public class SignOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printIntegerNumber(number);
    }

    public static void printIntegerNumber(int num) {
        if (num > 0) {
            System.out.println(String.format("The number %d is positive.",num));
        } else if (num < 0) {
            System.out.println(String.format("The number %d is negative.", num));
        } else {
            System.out.println(String.format("The number %d is zero.", num));
        }
    }
}
