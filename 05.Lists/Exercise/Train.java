import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = readIntList(scanner);
        int wagonCapacity =Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    int currentWagon = train.get(i);
                    int totalCount = currentWagon + people;

                    if (totalCount <= wagonCapacity) {
                        train.set(i,totalCount);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        printTrain(train);
    }

    private static void printTrain(List<Integer> train) {
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }

    private static List<Integer> readIntList(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<Integer> outputList = new ArrayList<>();
        for (String element : input) {
            outputList.add(Integer.parseInt(element));
        }
        return outputList;
    }
}
