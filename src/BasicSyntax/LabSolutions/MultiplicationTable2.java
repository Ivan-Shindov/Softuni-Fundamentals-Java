import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int index = scanner.nextInt();

        do {
            System.out.printf("%d X %d = %d%n", n, index, n * index);
            index++;
        } while (index <= 10);
    }
}
