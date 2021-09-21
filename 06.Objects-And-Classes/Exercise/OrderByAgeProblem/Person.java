package OrderByAgeProblem;

public class Person {
    public String name;
    public String idOfThePerson;
    public int age;

    public Person (String name, String idOfThePerson, int age){
        this.name = name;
        this.idOfThePerson = idOfThePerson;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        String result = String.format("%s with ID: %s is %d years old.%n"
                , this.name , this.idOfThePerson, this.age);
        return result;
    }
}
