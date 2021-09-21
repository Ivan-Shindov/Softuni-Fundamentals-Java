import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isPasswordCorrect = isValidPassword(password);
        if (isPasswordCorrect) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidPassword(String password) {
        boolean isEnough = isLengthBetweenSixAndTenSymbols(password);
        boolean containsOnlyDigitsAndLetters = containDigitsAndLetters(password);
        boolean containsEnoughDigits = containsAtLeastTwoDigits(password);
        boolean isValid = isEnough && containsOnlyDigitsAndLetters && containsEnoughDigits;
        return isValid;
    }

    public static boolean isLengthBetweenSixAndTenSymbols(String passowrd) {
        if (passowrd.length() >= 6 && passowrd.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean containDigitsAndLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean containsAtLeastTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                counter++;
                if (counter == 2) {
                    break;
                }
            }
        }
        if (counter == 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}
