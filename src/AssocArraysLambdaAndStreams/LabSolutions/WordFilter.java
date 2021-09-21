import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        Arrays.stream(line)
                .filter(x -> x.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
