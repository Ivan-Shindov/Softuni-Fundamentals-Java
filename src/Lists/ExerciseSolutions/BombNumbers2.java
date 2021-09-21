import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Judge 75%..

public class BombNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        List<Integer> commands = Arrays.stream(line.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(commands.get(0))) {
                int start = i - commands.get(1);
                if (start < 0) {
                    start = 0;
                }

                int finish = i + commands.get(1) + 1;
                if (finish > numbers.size()) {
                    finish = numbers.size();
                }

                //1 2 2 4 2 2 2 9
                for (int j = finish; j > start; j--) {
                    numbers.remove(j - 1 );

                }
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
