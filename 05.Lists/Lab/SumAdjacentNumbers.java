import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            double num = Double.parseDouble(arr[i]);

            numbers.add(num);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) + numbers.get(i);
                numbers.remove(i);
                numbers.set(i,sum);
                i = -1;
            }
        }
        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
