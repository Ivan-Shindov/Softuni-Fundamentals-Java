import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char i = 97; i < 97 + number; i++) {
            for (char j = 97; j < 97 + number; j++) {
                for (char k = 97; k < 97 + number; k++) {
                    System.out.println(String.format("%c%c%c",i,j,k));
                }
            }
        }
    }
}
