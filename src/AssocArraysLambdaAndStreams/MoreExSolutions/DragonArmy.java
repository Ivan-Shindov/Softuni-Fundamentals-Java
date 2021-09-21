import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String type = input[0];
            String name = input[1];
            for (int j = 2; j < input.length; j++) {
                if (input[j].equals("null") && j == 2) {
                    input[j] = "45";
                } else if (input[j].equals("null") && j == 3) {
                    input[j] = "250";
                } else if (input[j].equals("null") && j == 4) {
                    input[j] = "10";
                }
            }
            int damage = Integer.parseInt(input[2]);
            int health = Integer.parseInt(input[3]);
            int armor = Integer.parseInt(input[4]);


            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<String, int[]>());
            }
            if (!dragons.get(type).containsKey(name)) {
                dragons.get(type).put(name, new int[3]);
            }
            dragons.get(type).get(name)[0] = damage;
            dragons.get(type).get(name)[1] = health;
            dragons.get(type).get(name)[2] = armor;
        }

        for (Map.Entry<String, TreeMap<String, int[]>> typeInfo : dragons.entrySet()) {
            double[] average = calculateAverage(typeInfo.getValue());
            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",
                    typeInfo.getKey(),
                    average[0],
                    average[1],
                    average[2]));
            for (Map.Entry<String, int[]> entry : typeInfo.getValue().entrySet()) {
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",
                        entry.getKey(),
                        entry.getValue()[0],
                        entry.getValue()[1],
                        entry.getValue()[2]));
            }
        }
    }

    private static double[] calculateAverage(TreeMap<String, int[]> value) {
        double totalEntries = value.size();
        int totalDamage = 0;
        int totalHealth = 0;
        int totalArmor = 0;

        for (Map.Entry<String, int[]> entry : value.entrySet()) {
            totalDamage += entry.getValue()[0];
            totalHealth += entry.getValue()[1];
            totalArmor += entry.getValue()[2];
        }
        return new double[]{
                totalDamage / totalEntries,
                totalHealth / totalEntries,
                totalArmor / totalEntries
        };
    }
}
