import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            int current = Integer.parseInt(inputArr[i]);
            numbers.add(current);
        }

        List<Integer> listResult = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int num = 0;

            listResult = giveNewList(numbers,tokens,num);

            command = scanner.nextLine();
        }

        printList(listResult);

    }

    private static void printList(List<Integer> listResult) {
        for (Integer number : listResult) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> giveNewList(List<Integer> list, String[] tokens, int num) {
        switch (tokens[0]) {
            case "Add":
                num = Integer.parseInt(tokens[1]);
                list.add(num);
                break;
            case "Remove":
                num = Integer.parseInt(tokens[1]);
                list.remove(Integer.valueOf(num));
                break;
            case "RemoveAt":
                num = Integer.parseInt(tokens[1]);
                list.remove(num);
                break;
            case "Insert":
                num = Integer.parseInt(tokens[1]);
                int indexToInsert = Integer.parseInt(tokens[2]);
                list.add(indexToInsert, num);
                break;
        }
        return list;
    }
}
