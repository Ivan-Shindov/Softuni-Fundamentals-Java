import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int target = 0;
        double remainedPower = pokePower / 2.0;

        while (pokePower >= distance) {

            if (pokePower == remainedPower) {

                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
                if (pokePower >= distance) {
                    pokePower = pokePower - distance;
                    target++;
                }
            } else {
                pokePower = pokePower - distance;
                target++;
            }
        }
        System.out.println(pokePower);
        System.out.println(target);
    }
}
