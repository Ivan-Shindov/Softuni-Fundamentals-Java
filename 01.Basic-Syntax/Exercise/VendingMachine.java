import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coins = 0.0;
        double sum = 0.0;

        while (!"Start".equals(input)) {
            coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }
         input = scanner.nextLine();
        double price= 0.0;

        while (!"End".equals(input)) {

            if (input.equals("Nuts")) {
                price = 2.0;

            } else if (input.equals("Water")) {
                price = 0.7;

            } else if (input.equals("Crisps")) {
                price = 1.5;

            } else if (input.equals("Soda")) {
                price = 0.8;

            } else if (input.equals("Coke")) {
                price = 1.0;

            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
                continue;
            }

            if (sum >= price) {
                System.out.printf("Purchased %s%n",input);
                sum -= price;

            } else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n",sum);

    }
}
