import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        returnSignValue(num1,num2,num3);

    }

    private static void returnSignValue(int num1, int num2, int num3) {
        int[] array = new int[] {num1,num2,num3};
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative++;
            } else if (array[i] > 0) {
                countPositive++;
            }
        }
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if (countPositive == 3) {
            System.out.println("positive");
        } else if (countPositive == 1 && countNegative == 2) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
