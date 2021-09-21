import java.util.Scanner;

public class  Triangle {

    public static void printRow(int rowCount) {
        for (int i = 0; i < rowCount; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxRowCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < maxRowCount; i++) {
            printRow(i + 1);
        }

        for (int i = maxRowCount - 1; i >= 1 ; i--) {
            printRow(i);
        }
    }
}
