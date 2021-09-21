import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double result = calculationProductAndQuantity(product,quantity);
        System.out.println(String.format("%.2f",result));
    }

    public static double calculationProductAndQuantity (String product, int amount) {
        double result = 0;

        switch (product) {
            case "coffee":
                result = amount * 1.50;
                break;
            case "water":
                result = amount * 1.00;
                break;
            case "coke":
                result = amount * 1.40;
                break;
            case "snacks":
                result = amount * 2.00;
        }
        return result;
    }
}
