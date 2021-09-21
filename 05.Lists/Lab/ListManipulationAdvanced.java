import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            numbers.add(current);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        printListEven(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printListOdd(numbers);
                    }
                    break;
                case "Get":
                    printTotalSum(numbers);
                    break;
                case "Filter":
                    int numberFilter = Integer.parseInt(tokens[2]);
                    printFilter(tokens[1], numbers, numberFilter);

            }

            command = scanner.nextLine();
        }
    }


    private static void printFilter(String condition, List<Integer> numbers, int numberFilter) {
        switch (condition) {
            case "<":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < numberFilter) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) > numberFilter) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) >= numberFilter) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= numberFilter) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
        }
    }


    private static void printTotalSum(List<Integer> numbers) {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        System.out.println(total);
    }

    private static void printListOdd(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printListEven(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
