package ObjectAndClasses.ExerciseSolutions.StudentsProblem;

public class Students {
    private String name;
    private String lastName;
    private double grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Students(String name, String lastName , double grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Students() {

    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f%n", this.name, this.lastName, this.grade);
    }


}
