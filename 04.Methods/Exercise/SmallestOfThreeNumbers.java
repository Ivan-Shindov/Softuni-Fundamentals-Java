import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInteger(scanner);
        int b = readInteger(scanner);
        int c = readInteger(scanner);

        int minNumber = findMinNumber(a, b, c);
        System.out.println(minNumber);
    }

    public static int readInteger(Scanner scanner) {
        int number = scanner.nextInt();
        return number;
    }

    public static int findMinNumber(int first, int second , int third ) {
        if ((first < second && first < third)) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }
}
