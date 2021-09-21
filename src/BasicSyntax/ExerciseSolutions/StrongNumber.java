import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSum = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt("" + input.charAt(i));
            int currentSum = 1;
            for (int j = digit; j >= 1 ; j--) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }
        int number = Integer.parseInt(input);

        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
