import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        String result = printGrade(grade);
        System.out.println(result);
    }

    public static String printGrade(double grade) {
        String evaluation = "";

        if (grade >= 2.00 && grade < 3) {
            evaluation = "Fail";
        } else if (grade >= 3 && grade < 3.50) {
            evaluation = "Poor";
        }else if (grade >= 3.50 && grade < 4.50) {
            evaluation = "Good";
        } else if (grade >= 4.50 && grade < 5.50) {
            evaluation = "Very good";
        } else if (grade >= 5.50 && grade <= 6) {
            evaluation = "Excellent";
        }
        return evaluation;
    }
}
