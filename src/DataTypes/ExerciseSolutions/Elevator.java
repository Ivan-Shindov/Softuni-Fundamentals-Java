import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());
        double courses = Math.ceil(numberOfPeople * 1.0 / capacityOfElevator);

        System.out.print(String.format("%.0f", courses));
    }
}
