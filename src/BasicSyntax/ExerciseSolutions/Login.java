import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        boolean flag = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        for (int i = 1; i <= 4; i++) {
            String currentPassword = scanner.nextLine();

            if (password.equals(currentPassword)) {
                flag = true;
                System.out.println(String.format("User %s logged in.", username));
                break;

            } else if (i < 4) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!flag) {
            System.out.println(String.format("User %s blocked!", username));
        }
    }
}
