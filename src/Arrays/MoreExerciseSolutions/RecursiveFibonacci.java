package Arrays.MoreExerciseSolutions;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            long[] fibonacci = new long[n];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (int i = 2; i < fibonacci.length; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            for (int i = fibonacci.length - 1; i < fibonacci.length; i++) {
                System.out.println(fibonacci[i]);
            }
        }
    }
}
