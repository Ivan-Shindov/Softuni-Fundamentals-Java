import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> numbers = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] reversedInput = input[i].trim().split("\\s+");
            for (String element : reversedInput) {
                numbers.add(element);
            }
            numbers.remove("");
        }
        System.out.println(String.join(" ",numbers));
    }
}
