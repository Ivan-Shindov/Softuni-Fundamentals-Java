package CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split("\\s+");
            Employee employee = new Employee();

            employee.setName(array[0]);
            employee.setSalary(Double.parseDouble(array[1]));
            employee.setPosition(array[2]);
            employee.setDepartment(array[3]);

            switch (array.length) {
                case 5:
                    if (array[4].contains("@")) {
                        employee.setEmail(array[4]);
                    } else {
                        employee.setAge(Integer.parseInt(array[4]));
                    }
                    break;
                case 6:
                    if (array[4].contains("@")) {
                        employee.setEmail(array[4]);
                        employee.setAge(Integer.parseInt(array[5]));
                    } else {
                        employee.setAge(Integer.parseInt(array[4]));
                        employee.setEmail(array[5]);
                    }
                    break;

            }
                listOfEmployees.add(employee);
        }
        List<String> departmentsList = listOfEmployees.stream()
                .map(Employee::getDepartment)
                .distinct().collect(Collectors.toList());
        List<Department> departments = new ArrayList<>();
        for (String department : departmentsList) {
            departments.add(new Department(department,listOfEmployees
                    .stream()
                    .filter(e -> e.getDepartment().equals(department))
                    .collect(Collectors.toList())));
        }

        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);
        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n",department.getName());
        for (Employee employee : department.getEmployee()) {
            System.out.printf("%s %.2f %s %d%n"
                    ,employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}
