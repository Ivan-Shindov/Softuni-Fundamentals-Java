import java.util.Scanner;

public class TheathrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0.0;

        if ((age >= 0) && (age <= 18)) {
            switch (dayType) {

                case "Weekday": ticketPrice = 12; break;
                case "Weekend": ticketPrice = 15; break;
                case "Holiday": ticketPrice = 5; break;
            }
        } else if (age > 18 && age <= 64) {
            switch (dayType) {

                case "Weekday": ticketPrice = 18; break;
                case "Weekend": ticketPrice = 20; break;
                case "Holiday": ticketPrice = 12; break;
            }
        } else if (age > 64 && age <= 122) {

            switch (dayType) {
                case "Weekday": ticketPrice = 12; break;
                case "Weekend": ticketPrice = 15; break;
                case "Holiday": ticketPrice = 10; break;
            }
        } if (ticketPrice <= 0) {
            System.out.println("Error!");

        } else {
            System.out.printf("%.0f$%n",ticketPrice);
        }
    }
}
