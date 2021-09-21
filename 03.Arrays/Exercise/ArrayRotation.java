import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotationNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotationNumber % input.length; i++) {
            String temporary = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temporary;
        }
        System.out.println(String.join(" ", input));
    }
}
