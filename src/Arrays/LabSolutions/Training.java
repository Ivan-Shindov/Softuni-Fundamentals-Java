package Arrays.LabSolutions;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);     // 2 10 3
        }

        while (numbers.length > 1) {
            int[] realArray = new int[numbers.length - 1];
            for (int i = 0; i < realArray.length; i++) {
                realArray[i] = (numbers[i] + numbers[i + 1]);
            }
            numbers = realArray;
        }
        System.out.println(numbers[0]);
    }
}
