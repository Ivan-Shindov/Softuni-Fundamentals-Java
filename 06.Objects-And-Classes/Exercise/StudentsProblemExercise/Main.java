package StudentsProblemExercise;

import StudentsProblem.Schoolar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        ArrayList<Schoolar> listOfStudents = new ArrayList<>();

        while(countOfStudents != 0) {
            String[] infoForStudents = scanner.nextLine().split("\\s+");
            String firstName = infoForStudents[0];
            String lastName = infoForStudents[1];
            double grade = Double.parseDouble(infoForStudents[2]);
            Schoolar student = new Schoolar(firstName,lastName,grade);
            listOfStudents.add(student);

            countOfStudents--;
        }
        listOfStudents.sort(Comparator.comparingDouble(Schoolar::getGrade));
        Collections.reverse(listOfStudents);
        for (StudentsProblemExercise.Students listOfStudent : listOfStudents) {
            System.out.print(listOfStudent);
        }

    }
}
