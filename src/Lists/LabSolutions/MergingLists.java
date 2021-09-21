import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> left = readList(scanner);
        List<Integer> right = readList(scanner);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < left.size() && i < right.size()) {
            result.add(left.get(i));
            result.add(right.get(i));

            i++;
        }

        if (i < left.size()) {
            for (int j = i; j < left.size(); j++) {
                result.add(left.get(j));
            }
        } else if (i < right.size()) {
            for (int j = i; j < right.size(); j++) {
                result.add(right.get(j));
            }
        }

        for (Integer number : result) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");


        List<Integer> result =
                Arrays.stream(split)
                        .map(item -> Integer.parseInt(item))
                        .collect(Collectors.toList());

        return result;
    }
}
