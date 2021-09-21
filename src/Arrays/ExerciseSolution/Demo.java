package Arrays.ExerciseSolution;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String[] array = scanner.nextLine().split(" ");
      int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            String temporary = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];

            }
            array[array.length - 1] = temporary;
        }
        System.out.print(String.join(" ", array));
    }
}
