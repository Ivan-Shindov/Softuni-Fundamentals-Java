import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int padawansCount = Integer.parseInt(scanner.nextLine());
        double pricePerLightsabers = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double lightsaberPrice = Math.ceil(padawansCount * 1.1) * pricePerLightsabers;
        double robesPrice = padawansCount * pricePerRobe;
        int freeBelts = padawansCount / 6;
        double beltsTotalPrice = (padawansCount - freeBelts) * pricePerBelt;

        double finalSum = lightsaberPrice + robesPrice + beltsTotalPrice;

        if (finalSum > budget) {
            double moneyNeed = finalSum - budget;
            System.out.println(String.format("Ivan Cho will need %.2flv more.",moneyNeed));
        } else {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", finalSum));
        }
    }
}
