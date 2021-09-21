package Arrays.ExerciseSolution;

import java.util.Scanner;

public class ZigZag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentLine = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = currentLine[0];
                secondArray[i] = currentLine[1];
            } else {
                firstArray[i] = currentLine[1];
                secondArray[i] = currentLine[0];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
