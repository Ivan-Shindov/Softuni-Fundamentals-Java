package StudentsProblem;

import StudentsProblemExercise.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Schoolar> listOfStudents = new ArrayList<>();
        while (!input.equals("end")) {
            String[] line = input.split("\\s+");
            Schoolar schoolar = new Schoolar();
            schoolar.setFirstName(line[0]);
            schoolar.setLastName(line[1]);
            schoolar.setAge(Integer.parseInt(line[2]));
            schoolar.setHometown(line[3]);
            listOfStudents.add(schoolar);

            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Schoolar students : listOfStudents) {
            if (cityName.equals(students.getHometown())) {
                System.out.println(students.getString());
            }
        }

    }
}
