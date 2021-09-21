import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean result = isPalindrome(input);

            if (result) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }


    public static boolean isPalindrome (String input) {
        boolean flag = false;
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        if (reversedInput.equals(input)) {
            flag = true;
        }
        return flag;
    }
}
