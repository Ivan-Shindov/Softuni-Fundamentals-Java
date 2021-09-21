import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] tokens = input.split("\\s+");
            String nameProduct = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!products.containsKey(nameProduct)) {
                products.put(nameProduct, price);
                productsQuantity.put(nameProduct, quantity);

            } else {
                int newQuantity = productsQuantity.get(nameProduct) + quantity;
                productsQuantity.put(nameProduct, newQuantity);

                if (products.get(nameProduct) != price) {
                    products.put(nameProduct, price);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            double price = products.get(entry.getKey()) * productsQuantity.get(entry.getKey());
            System.out.println(String.format("%s -> %.2f", entry.getKey(), price));
        }
    }
}
