import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);

        if (first > last) {
            printSymbols(last, first);
        } else {
            printSymbols(first, last);
        }
    }


    public static void  printSymbols (char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(String.format("%c ", i));
        }
    }
}
