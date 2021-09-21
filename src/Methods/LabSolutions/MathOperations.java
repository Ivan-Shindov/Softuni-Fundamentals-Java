import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = getTotalOfNums(firstNum,operator,secondNum);
        System.out.println(new DecimalFormat().format(result));

    }

    private static double getTotalOfNums(int firstNum,char operator ,int secondNum) {
        double result = 0;

        if (operator == '/') {
            result = firstNum / secondNum;

        } else if (operator == '*') {
            result = firstNum * secondNum;

        } else if (operator == '+') {
            result = firstNum + secondNum;

        } else if (operator == '-') {
            result = firstNum - secondNum;

        }
        return result;
    }
}
