package ObjectAndClasses.ExerciseSolutions.OpinionPollProblem;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String result = String.format("%s - %d", this.name, this.age);
        return result;
    }
}
