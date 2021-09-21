package VehicleCatalogueProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Vehicles> listOfVehicles = new ArrayList<>();


        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String brand = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            Vehicles vehicle = null;
            if (type.equals("car")) {
                vehicle = new Vehicles("Car", brand, color, horsepower);
            } else if (type.equals("truck")){
                vehicle = new Vehicles("Truck", brand, color, horsepower);
            }
            listOfVehicles.add(vehicle);

            input = scanner.nextLine();
        }

        String brand = scanner.nextLine();
        while (!brand.equals("Close the Catalogue")) {
            for (Vehicles vehicle : listOfVehicles) {
                if (vehicle.getBrand().equals(brand)) {
                    System.out.print(vehicle);
                    break;
                }
            }
            brand = scanner.nextLine();
        }
        double horsepowerCar = getHorsepower(listOfVehicles, "Car");
        double horsepowerTruck = getHorsepower(listOfVehicles, "Truck");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", horsepowerCar));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", horsepowerTruck));
    }

    public static double getHorsepower(ArrayList<Vehicles> vehicles, String vehicleType){
        double sum = 0.0;
        int counter = 0;
        for (Vehicles vehicle : vehicles) {
            if (vehicle.getType().equals(vehicleType)) {
                sum += vehicle.getHorsepower();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}
