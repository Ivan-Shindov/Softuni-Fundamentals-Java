import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int totalOfTwoNums = getSumOfFirstAndSecondNum(firstNum,secondNum);
        int result = getSubtract(totalOfTwoNums,thirdNum);
        System.out.println(result);

    }


    private static int getSubtract(int totalOfTwoNums, int number3) {
        return totalOfTwoNums - number3;
    }

    public static int getSumOfFirstAndSecondNum (int number1, int number2) {
        return number1 + number2;
    }
}
