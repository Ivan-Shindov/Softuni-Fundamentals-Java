import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCnt = 0;
        int mouseCnt= 0;
        int keyboardCnt = 0;
        int displayCnt = 0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                headsetCnt++;
            }
            if (i % 3 == 0) {
                mouseCnt++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardCnt++;
            }
            if (i % 12 == 0) {
                displayCnt++;
            }
        }
        double totalSum = (headsetCnt * headsetPrice) + (mouseCnt * mousePrice) + (keyboardCnt * keyboardPrice) +
                (displayCnt * displayPrice);
        System.out.println(String.format("Rage expenses: %.2f lv.",totalSum));
    }
}
