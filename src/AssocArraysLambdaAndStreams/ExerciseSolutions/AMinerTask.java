import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(input, 0);
            int newQuantity = resources.get(input) + quantity;
            resources.put(input, newQuantity);

            input = scanner.nextLine();
        }

        resources
                .entrySet()
                .forEach(e -> System.out.println(String.format("%s -> %d",
                        e.getKey()
                        , e.getValue())));
    }
}
