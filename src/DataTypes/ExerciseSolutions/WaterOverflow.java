import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int litersInTank = 0;
        int capacity = 255;

        for (int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());

            if (litersInTank + litres > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                litersInTank += litres;
            }
        }
        System.out.println(litersInTank);
    }
}
