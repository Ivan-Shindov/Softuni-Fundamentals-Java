import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            String num = "" + i;
            BigInteger multiplier = new BigInteger(num);
            factorial = factorial.multiply(multiplier);
        }
        System.out.println(factorial);
    }
}
