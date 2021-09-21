import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        int[] firstArr = new int[input.length];
        int[] secondArr = new int[input2.length];

        for (int i = 0; i < input.length; i++) {
            firstArr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input2.length; i++) {
            secondArr[i] = Integer.parseInt(input2[i]);
        }

        int sum = 0;
        boolean flag = true;

        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        }
    }
}
