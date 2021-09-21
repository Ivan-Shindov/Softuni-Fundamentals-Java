import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (dayOfWeek.equals("Friday")) {
            switch (typeOfGroup) {
                case "Students":
                    price = 8.45;
                    break;
                case "Business":
                    price = 10.90;
                    break;
                case "Regular":
                    price = 15;
            }

        } else if (dayOfWeek.equals("Saturday")) {
            switch (typeOfGroup) {
                case "Students":
                    price = 9.80;
                    break;
                case "Business":
                    price = 15.60;
                    break;
                case "Regular":
                    price = 20;
            }
        } else if (dayOfWeek.equals("Sunday")) {
            switch (typeOfGroup) {
                case "Students":
                    price = 10.46;
                    break;
                case "Business":
                    price = 16;
                    break;
                case "Regular":
                    price = 22.50;
            }
        }
        double totalPrice = price * peopleCount;

        if (typeOfGroup.equals("Students") && peopleCount >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);

        } else if (typeOfGroup.equals("Business") && peopleCount >= 100) {
            totalPrice = (peopleCount - 10) * price;

        } else if (typeOfGroup.equals("Regular") && peopleCount >= 10 && peopleCount <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
