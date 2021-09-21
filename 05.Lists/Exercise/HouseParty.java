import java.util.ArrayList;
        import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> guestList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+",2);
            String name = tokens[0];
            if (tokens[1].equals("is going!")) {
                if (guestList.contains(name)) {
                    System.out.println(String.format("%s is already in the list!", name));
                } else {
                    guestList.add(name);
                }
            } else {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.println(String.format("%s is not in the list!", name));
                }
            }
        }
        for (String person : guestList) {
            System.out.println(person);
        }
    }
}
