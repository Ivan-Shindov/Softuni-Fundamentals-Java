package Arrays.LabSolutions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        int numberDay = Integer.parseInt(scanner.nextLine());

        if (numberDay > 0 && numberDay <= 7) {
            numberDay = numberDay - 1;
            System.out.println(days[numberDay]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
