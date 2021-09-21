package Arrays.ExerciseSolution;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int wagon : train) {
            System.out.print(wagon + " ");
            sum += wagon;
        }
        System.out.println();
        System.out.println(sum);
    }
}
