package ObjectAndClasses.ExerciseSolutions.OrederByAgeProblem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> listOfPeople = new ArrayList<>();

        while(!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String idNumber = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            Person person = new Person(name,idNumber,age);
            listOfPeople.add(person);

            input = scanner.nextLine();
        }
        listOfPeople.sort((p1,p2) ->p1.getAge() - p2.getAge());
        for (Person person : listOfPeople) {
            System.out.print(person);
        }
    }
}
