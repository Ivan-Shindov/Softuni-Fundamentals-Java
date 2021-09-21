import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char lastChar = scanner.nextLine().charAt(0);

        if (firstChar > lastChar) {
            printChars(lastChar, firstChar);
        } else {
            printChars(firstChar, lastChar);
        }
    }

    public static void printChars (char start, char finish) {
        for (int i = start + 1; i < finish; i++) {
            System.out.print(String.format("%c ", i));
        }
        System.out.println();
    }
}
