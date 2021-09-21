import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();
        String input = scanner.nextLine();

        printResult(dataType,input);
    }

    private static void printResult(String dataType, String input) {

        if (dataType.equals("int")) {
            int number = Integer.parseInt(input);
            System.out.println(number * 2);
        } else if (dataType.equals("real")) {
            double floatNumber = Double.parseDouble(input);
            double result = floatNumber * 1.5;
            System.out.printf("%.2f",result);
        } else if (dataType.equals("string")){
            System.out.println("$" + input + "$");
        }
    }
}
