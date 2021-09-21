import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        ArrayList<String> furniture = new ArrayList<>();

        while(!input.equals("Purchase")) {

            Pattern pattern = Pattern.compile(
                    ">>(?<name>[A-Za-z]+)<<(?<price>[+-]?([0-9]*[.])?[0-9]+)!(?<qnt>\\d+)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String nameFurniture = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("qnt"));

                sum += (price * quantity);
                furniture.add(nameFurniture);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String str : furniture) {
            System.out.println(str);
        }
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
