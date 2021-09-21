import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        if (line.contains("|")) {
            line = line.toUpperCase();
        } else if (line.contains("->")) {
            line = line.replace('-', '>');
        }
        System.out.println(line);
    }
}
