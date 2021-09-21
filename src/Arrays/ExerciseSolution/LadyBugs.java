package Arrays.ExerciseSolution;

import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        int[] field = new int[fieldSize];

        String[] bugIndexes = scanner.nextLine().split(" ");

        for (String index : bugIndexes) {
            int i = Integer.parseInt(index);
            if (i >= 0 && i < field.length) {
                field[i] = 1;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens =  input.split(" ");

            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index >= 0 && index < field.length && field[index] == 1) {

                field[index] = 0;

                if (direction.equals("right")) {
                    index += flyLength;

                    while (index < field.length && field[index] == 1) {

                        index += flyLength;
                    }

                    if (index < field.length) {
                        field[index] = 1;
                    }
                } else {
                    index -= flyLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int number : field) {
            System.out.print(number + " ");
        }
    }
}
