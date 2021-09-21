import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int totalSum = 0;
        int workersConsume = 26;
        boolean flag = false;


        for (int i = yield; i >= 100 ; i -=10) {

            totalSum = totalSum + (i - workersConsume);
            daysCount++;
            flag = true;
        }
        if (flag) {
            totalSum -= workersConsume;
            System.out.println(daysCount);
            System.out.println(totalSum);

        } else {
            System.out.println(daysCount);
            System.out.println(totalSum);
        }
    }
}
