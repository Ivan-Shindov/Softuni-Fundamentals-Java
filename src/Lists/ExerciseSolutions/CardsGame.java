import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> deckOne = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            deckOne.add(Integer.parseInt(input[i]));
        }

        String[] input2 = scanner.nextLine().split("\\s+");
        List<Integer> deckTwo = new ArrayList<>();
        for (int i = 0; i < input2.length; i++) {
            deckTwo.add(Integer.parseInt(input2[i]));
        }

        while (Math.min(deckOne.size(), deckTwo.size()) != 0) {

            if (deckOne.get(0) > deckTwo.get(0)) {
                    deckOne.add(deckOne.get(0));
                    deckOne.add(deckTwo.get(0));
                    deckTwo.remove(0);
                    deckOne.remove(0);

            } else if (deckOne.get(0).equals(deckTwo.get(0))) {
                    deckOne.remove(0);
                    deckTwo.remove(0);

            } else if (deckTwo.get(0) > deckOne.get(0)) {
                    deckTwo.add(deckTwo.get(0));
                    deckTwo.add(deckOne.get(0));
                    deckOne.remove(0);
                    deckTwo.remove(0);
            }
        }
        int sum = 0;
        if (deckOne.size() == 0) {

            for (Integer value : deckTwo) {

                sum = sum + value;
            }
           System.out.println("Second player wins! Sum: " + sum);

       } else if (deckTwo.size() == 0) {

            for (Integer value : deckOne) {
                sum += value;
            }
            System.out.println("First player wins! Sum: " + sum);
       }
    }
}
