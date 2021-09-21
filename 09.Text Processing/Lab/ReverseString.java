import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")) {
            String reversedText = "";
            for (int i = text.length() -1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }
            System.out.println(String.format("%s = %s", text, reversedText));

            text = scanner.nextLine();
        }
    }
}
