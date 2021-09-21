package StudentsProblemTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> listOfStudents = new ArrayList<>();
        while (!input.equals("end")) {
            String[] line = input.split("\\s+");
            int age = Integer.parseInt(line[2]);
            Student found = findByFirstAndLastName(listOfStudents, line[0], line[1]);

            if (found != null) {
                listOfStudents.remove(found);
            }

            Student student = new Student(line[0], line[1], age, line[3]);
            listOfStudents.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : listOfStudents) {
            if (city.equals(student.getHometown())) {
                System.out.println(student.getString());
            }
        }
    }


    private static Student findByFirstAndLastName (List < Student > listOfStudents
            , String firstName, String lastName){
        for (Student student : listOfStudents) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}
