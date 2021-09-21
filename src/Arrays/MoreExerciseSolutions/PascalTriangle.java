package Arrays.MoreExerciseSolutions;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRow = Integer.parseInt(scanner.nextLine());
        int[] previousRow = new int[1];
        int[] currentRow = new int[1];

        for (int i = 1; i <= numRow; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                currentRow[j + 1] = previousRow[j] + previousRow[j +1];
            }
            for (int num : currentRow) {
                System.out.print(num + " ");
            }
            System.out.println();
            previousRow = currentRow;
        }

    }
}
