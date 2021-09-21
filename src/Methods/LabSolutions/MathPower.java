import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double firstNum = Double.parseDouble(scanner.nextLine());
       int secondNum = Integer.parseInt(scanner.nextLine());

       double result = numberOfGivenPower(firstNum,secondNum);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double numberOfGivenPower (double num, int numPower) {
        double result = 1;

        for (int i = 0; i < numPower; i++) {
            result = result * num;
        }
        return result;
    }
}
