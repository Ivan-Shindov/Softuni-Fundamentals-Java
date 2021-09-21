import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String, ArrayList<String>> company = new TreeMap<>();

        while(!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeID = tokens[1];

            company.putIfAbsent(companyName, new ArrayList<>());
            if (!company.get(companyName).contains(employeeID)) {
                company.get(companyName).add(employeeID);
            }

            input = scanner.nextLine();
        }

        company.entrySet()
                .stream()
                .forEach(c -> {
                    System.out.println(String.format("%s",c.getKey()));
                    c.getValue()
                            .stream()
                            .forEach(e -> System.out.println(String.format("-- %s"
                            ,e)));
                });
    }
}
