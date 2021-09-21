import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String text = scanner.nextLine();
        while (text.contains(key)) {
            int keyLength = key.length();
            int startIndexOfKey = text.indexOf(key);

            text = text.substring(0, startIndexOfKey) +
                    text.substring(startIndexOfKey + keyLength);
        }
        System.out.println(text);
    }
}
