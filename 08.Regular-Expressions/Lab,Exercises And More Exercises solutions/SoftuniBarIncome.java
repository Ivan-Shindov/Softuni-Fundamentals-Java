import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        double totalIncome = 0.0;

        while (!line.equals("end of shift")) {

            double totalPrice = 0;

            Pattern pattern = Pattern.compile(
                    "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|" +
                            "(?<count>\\d+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
               String name = matcher.group("name");
               String product = matcher.group("product");
               double price = Double.parseDouble(matcher.group("price"));
               int quantity = Integer.parseInt(matcher.group("count"));
                totalPrice = price * quantity;

                System.out.println(String.format("%s: %s - %.2f",name, product,totalPrice));
                totalIncome += totalPrice;
            }

            line = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);

    }
}
