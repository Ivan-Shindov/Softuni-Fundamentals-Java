import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")) {
            printResultWithAdd(firstNum,secondNum);

        } else if (command.equals("multiply")) {
            printResultWithMultiply(firstNum,secondNum);

        } else if (command.equals("subtract")) {
            printResultWithSubtract(firstNum,secondNum);

        } else if (command.equals("divide")) {
            printResultWithDivide(firstNum,secondNum);

        }
    }

    private static void printResultWithDivide(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }

    private static void printResultWithSubtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    private static void printResultWithMultiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    private static void printResultWithAdd(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}
