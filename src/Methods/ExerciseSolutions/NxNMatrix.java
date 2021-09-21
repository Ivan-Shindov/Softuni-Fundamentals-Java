import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
