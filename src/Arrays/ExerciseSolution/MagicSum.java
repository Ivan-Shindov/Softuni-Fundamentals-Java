package Arrays.ExerciseSolution;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int firstDigit = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int secondDigit = numbers[j];
                if (firstDigit + secondDigit == givenNumber) {
                    System.out.println(firstDigit + " " + secondDigit);
                }
            }
        }
    }
}
