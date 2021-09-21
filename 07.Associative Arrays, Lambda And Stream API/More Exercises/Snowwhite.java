import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String,Integer> dwarfs = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> dwarfByCountColor = new LinkedHashMap<>();

        while(!input.equals("Once upon a time")) {
            String[] tokens = input.split(" <:> ");
            String dwarf = tokens[1] + " " + tokens[0];
            String hatColor = tokens[1];
            int physic = Integer.parseInt(tokens[2]);

            dwarfByCountColor.putIfAbsent(hatColor, 0);
            dwarfByCountColor.put(hatColor,dwarfByCountColor.get(hatColor) + 1);

            if (!dwarfs.containsKey(dwarf)) {
                dwarfs.put(dwarf,physic);

            } else {
                if (dwarfs.get(dwarf) < physic) {
                    dwarfs.put(dwarf,physic);
                    dwarfByCountColor.put(hatColor, dwarfByCountColor.get(hatColor) - 1);
                }
            }
            input = scanner.nextLine();
        }
        dwarfs.entrySet().stream()
                .sorted((p1,p2) -> {
                    int sort = Integer.compare(p2.getValue(),p1.getValue());
                    if (sort == 0) {

                        String[] color1 = p1.getKey().split(" ");
                        String[] color2 = p2.getKey().split(" ");

                        int size1 = dwarfByCountColor.get(color1[0]);
                        int size2 = dwarfByCountColor.get(color2[0]);
                        sort = Integer.compare(size2,size1);
                    }
                    return sort;
                })
                .forEach(p -> {
                    String[] print = p.getKey().split(" ");
                    System.out.println(String.format("(%s) %s <-> %d",
                            print[0],
                            print[1],
                            p.getValue()));
                });

    }
}
