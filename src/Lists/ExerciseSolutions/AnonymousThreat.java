import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }

        String line = scanner.nextLine();
        while (!line.equals("3:1")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            if (command.equals("merge")) {
                list = giveMergeElements(tokens, list);

            } else if (command.equals("divide")) {
                list = giveDivideList(tokens, list);
            }

            line = scanner.nextLine();
        }
        for (String string : list) {
            System.out.print(string + " ");
        }
    }

    private static List<String> giveMergeElements(String[] tokens, List<String> list) {
        int startIndex = Integer.parseInt(tokens[1]);
        int lastIndex = Integer.parseInt(tokens[2]);

        if (startIndex < 0) {
            startIndex = 0;
        }
        if (lastIndex > list.size() - 1) {
            lastIndex = list.size() - 1;
        }

        int counter = startIndex;
        for (int i = startIndex; i < lastIndex; i++) {
            String concatenated = list.get(counter) + list.get(counter + 1);
            list.set(counter, concatenated);
            list.remove(counter + 1);
        }
        return list;
    }

    private static List<String> giveDivideList(String[] tokens, List<String> list) {
        int index = Integer.parseInt(tokens[1]);
        int partition = Integer.parseInt(tokens[2]);

        if (index >= 0 && index < list.size() && partition >= 0 && partition <= 100) {
            String element = list.get(index);
            List<String> newList = new ArrayList<>();

            if (element.length() % partition == 0) {
                int portionsLength = element.length() / partition;
                int count = 0;
                for (int i = 0; i < partition; i++) {
                    String concatenate = "";
                    for (int j = 0; j < portionsLength; j++) {
                        char symbol = element.charAt(count);
                        concatenate += symbol;
                        count++;
                    }
                    newList.add(concatenate);
                }
            } else {
                int portionsLength = element.length() / partition;      // 1 porLen
                int count = 0;   // 4
                for (int i = 0; i < partition; i++) {   // partition 3
                    String concatenate = "";
                    if (i == partition - 1) {  // i 2
                        for (int j = count; j < element.length(); j++) {
                            char symbol = element.charAt(count);
                            concatenate += symbol;
                            count++;
                        }
                    } else {
                        for (int j = 0; j < portionsLength; j++) {
                            char symbol = element.charAt(count);
                            concatenate += symbol;
                            count++;
                        }
                    }
                    newList.add(concatenate);
                }
            }

            list.remove(index);
            list.addAll(index, newList);
        }
        return list;
    }
}
