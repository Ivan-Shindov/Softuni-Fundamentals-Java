import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Pattern patternHealth = Pattern.compile("[^\\d+-\\/*\\.]");
        Pattern patternDamage = Pattern.compile("[+-]?[0-9]+\\.?[0-9]*");
        Pattern patternMultiply = Pattern.compile("\\*");
        Pattern patternDivision = Pattern.compile("\\/");

        TreeMap<String,Double> demonsDmg = new TreeMap<>();
        TreeMap<String,Integer> demonsHealth = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String demonName = input[i].replaceAll(" ","");
            StringBuilder health = new StringBuilder();
            int healthInt = 0;
            double damage = 0.0;


            Matcher matcherHealth = patternHealth.matcher(demonName);
            Matcher matcherDamage = patternDamage.matcher(demonName);
            Matcher matcherMultiply = patternMultiply.matcher(demonName);
            Matcher matcherDivision = patternDivision.matcher(demonName);

            while (matcherHealth.find()) {
                health.append(matcherHealth.group());
            }
            for (int j = 0; j < health.length(); j++) {
                healthInt += health.charAt(j);
            }
            while (matcherDamage.find()) {
              damage += Double.parseDouble((matcherDamage.group()));
            }

            while (matcherMultiply.find()) {
                damage *= 2;
            }
            while (matcherDivision.find()) {
                damage /= 2;
            }

            demonsHealth.putIfAbsent(demonName,0);
            demonsHealth.put(demonName, healthInt);
            demonsDmg.putIfAbsent(demonName, 0.0);
            demonsDmg.put(demonName, damage);
        }

        for (Map.Entry<String, Integer> entry : demonsHealth.entrySet()) {
            System.out.println(String.format("%s - %d health, %.2f damage",
                    entry.getKey(),
                    entry.getValue(),
                    demonsDmg.get(entry.getKey())));
        }
    }
}
