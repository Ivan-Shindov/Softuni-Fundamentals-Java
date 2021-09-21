import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int j = 0; j < row; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
