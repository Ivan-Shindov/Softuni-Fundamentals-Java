import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = "2 8 30 25 40 72 -2 44 56";
        String[] numberAsString = values.split(" ");
        int[] numbers = new int[numberAsString.length];

        for (int i = 0; i < numberAsString.length; i++) {
            numbers[i] = Integer.parseInt(numberAsString[i]);
        }
        System.out.println();
    }
}
