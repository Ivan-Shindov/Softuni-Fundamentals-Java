package OpinionPollProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);
            people.add(person);
        }

        people.stream().filter(p -> p.getAge() > 30)
                .sorted((p1,p2) -> p1.getName()
                        .compareTo(p2.getName())).forEach(p -> System.out.println(p.toString()));
    }
}
