import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();
        LinkedHashMap<Character,Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                continue;
            }

            count.putIfAbsent(text[i], 0);
            int newCount = count.get(text[i]) + 1;
            count.put(text[i], newCount);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}
