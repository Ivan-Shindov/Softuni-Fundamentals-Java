import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int times = 10;

        for (int i = 1; i <= times; i++) {
            System.out.printf("%d X %d = %d%n", input, i, input * i);

        }
    }
}

