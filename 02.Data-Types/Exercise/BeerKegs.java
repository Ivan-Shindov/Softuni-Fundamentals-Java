import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double bestKegVolume = -1.0;
        String bestKegModel = "";

        for (int i = 0; i < n; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > bestKegVolume) {
                bestKegVolume = volume;
                bestKegModel = kegModel;
            }
        }
        System.out.println(bestKegModel);
    }
}
