package Arrays.LabSolutions;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }

        while (numbers.length > 1) {
            int[] temporaryArray = new int[numbers.length - 1];
            for (int i = 0; i < temporaryArray.length; i++) {
                temporaryArray[i] = numbers[i] + numbers[i + 1];
            }
            numbers = temporaryArray;
        }
        System.out.println(numbers[0]);
    }
}
