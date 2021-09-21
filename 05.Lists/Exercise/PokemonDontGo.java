import java.util.ArrayList;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int current = Integer.parseInt(input[i]);
            list.add(current);
        }

        int sum = 0;
        while (!list.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int deletedElement = list.remove(0);
                sum += deletedElement;
                for (int i = 0; i < list.size(); i++) {
                    int currentElement = list.get(i);

                    if (currentElement <= deletedElement) {
                        currentElement = currentElement + deletedElement;
                        list.set(i, currentElement);
                    } else {
                        currentElement = currentElement - deletedElement;
                        list.set(i, currentElement);
                    }
                }
                int lastIndex = list.get(list.size() - 1);
                list.add(0, lastIndex);

            } else if (index > list.size() - 1) {
                int deletedElement = list.remove(list.size() - 1);
                sum += deletedElement;
                for (int i = 0; i < list.size(); i++) {
                    int currentElement = list.get(i);

                    if (currentElement <= deletedElement) {
                        currentElement = currentElement + deletedElement;
                        list.set(i, currentElement);
                    } else {
                        currentElement = currentElement - deletedElement;
                        list.set(i, currentElement);
                    }
                }
                int firstIndex = list.get(0);
                list.add(firstIndex);
            } else {
                int deletedElement = list.remove(index);
                sum += deletedElement;
                for (int i = 0; i < list.size(); i++) {
                    int currentElement = list.get(i);

                    if (currentElement <= deletedElement) {
                        currentElement = currentElement + deletedElement;
                        list.set(i, currentElement);
                    } else {
                        currentElement = currentElement - deletedElement;
                        list.set(i, currentElement);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
