import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[0] || array[i] == array[1]) {
                array[i] = 1;
                System.out.print(array[i]);
                System.out.print(" ");
                continue;
            }
            if (array[i] == array[2]) {
                array[i] = 2;
                System.out.print(array[i]);
                System.out.print(" ");
                continue;
            }
            array[i] = array[i -1] + array[i -2] + array[i -3];
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
