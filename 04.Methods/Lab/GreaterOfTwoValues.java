import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")) {

            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();
            int firstValueNum = Integer.parseInt(firstValue);
            int secondValueNum = Integer.parseInt(secondValue);

            int result = getMax(firstValueNum,secondValueNum);
            System.out.println(result);

        } else if (type.equals("char")) {

            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();
            char firstValueChar = firstValue.charAt(0);
            char secondValueChar = secondValue.charAt(0);

            char result = getMax(firstValueChar,secondValueChar);
            System.out.println(result);

        } else if (type.equals("string")) {

            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();
            
            String result = getMax(firstValue,secondValue);
            System.out.println(result);

        }

    }

    private static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) >= 0) {
            return firstValue;
        }
        return secondValue;
    }

    private static char getMax(char firstValueChar, char secondValueChar) {
        if (firstValueChar > secondValueChar) {
            return firstValueChar;
        }
        return secondValueChar;
    }

    private static int getMax(int firstValueInt, int secondValueInt) {
        if (firstValueInt > secondValueInt) {
            return firstValueInt;
        }
        return secondValueInt;
    }
}

            // Another decision --->

//  public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String type = scanner.nextLine();
//
//        if (type.equals("int")) {
//            int first = Integer.parseInt(scanner.nextLine());
//            int second = Integer.parseInt(scanner.nextLine());
//            System.out.println(getMax(first,second));
//        } else if (type.equals("char")) {
//            char first = scanner.nextLine().charAt(0);
//            char second = scanner.nextLine().charAt(0);
//            System.out.println(getMax(first,second));
//        } else if (type.equals("string")) {
//            String first = scanner.nextLine();
//            String second = scanner.nextLine();
//            System.out.println(getMax(first,second));
//        }
//
//    }
//
//    private static int getMax(int first, int second) {
//        if (first > second) {
//            return first;
//        }
//        return second;
//    }
//
//    private static char getMax(char first, char second) {
//        if (first > second) {
//            return first;
//        }
//        return second;
//    }
//
//    private static String getMax(String first, String second) {
//        if (first.compareTo(second) >= 0) {
//            return first;
//        }
//        return second;
//    }
