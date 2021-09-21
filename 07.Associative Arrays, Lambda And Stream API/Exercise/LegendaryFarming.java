import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> items = new TreeMap<>() {{
            put("shards", 0);
            put("fragments", 0);
            put("motes", 0);
        }};
        TreeMap<String, Integer> junk = new TreeMap<>();

        boolean isFound = false;

        while (!isFound) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int count = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();

                if (items.containsKey(material)) {
                    addMaterial(items, material, count);
                    isFound = hasLegendaryItem(items, material);
                    if (isFound) {
                        break;
                    }
                } else {
                    addMaterial(junk, material, count);
                }
            }
        }
        items.entrySet()
                .stream()
                .sorted((i1,i2) -> Integer.compare(i2.getValue(), i1.getValue()))
                .forEach(i -> System.out.println(String.format("%s: %d"
                        ,i.getKey()
                        ,i.getValue())));

        junk.entrySet()
                .forEach(j -> System.out.println(String.format("%s: %d"
                        ,j.getKey()
                        ,j.getValue())));
    }

    private static boolean hasLegendaryItem(TreeMap<String, Integer> items, String key) {
        int count = items.get(key);
        if (count >= 250) {
            items.put(key, count - 250);
            switch (key) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    return true;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    return true;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    return true;
            }
        }
        return false;
    }


    private static void addMaterial(TreeMap<String, Integer> items, String key, int value) {
        items.putIfAbsent(key, 0);
        int newCount = items.get(key) + value;
        items.put(key, newCount);
    }

}
