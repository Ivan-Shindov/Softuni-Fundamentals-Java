package CompanyRoster;

public class Employee {
    public String name;
    public double salary;
    public String position;
    public String department;
    public String email;
    public int age;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee() {
        this.email = "n/a";
        this.age = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    int getAge() {
        return age;
    }
}
