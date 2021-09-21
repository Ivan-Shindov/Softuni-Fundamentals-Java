import java.util.Scanner;

public class RepeatedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        String result = "";
        for (String s : text) {
            result += AddRepeat(s);
        }
        System.out.println(result);
    }


    private static String AddRepeat(String word) {
        int times = word.length();
        String result = "";
        for (int i = 0; i < times; i++) {
            result += word;
        }
        return result;
    }
}
