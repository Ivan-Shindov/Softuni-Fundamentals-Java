package ObjectAndClasses.ExerciseSolutions.VehicleCatalogueProblem;

public class Vehicles {

    private String type;
    private String brand;
    private String color;
    private int horsepower;

    public Vehicles(String typeOfVehicle, String brandOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.type = typeOfVehicle;
        this.brand = brandOfVehicle;
        this.color = colorOfVehicle;
        this.horsepower = horsepowerOfVehicle;
    }

    public String getType() {
        return type;
    }


    public String getBrand() {
        return brand;
    }


    public int getHorsepower() {
        return horsepower;
    }


    @Override
    public String toString() {
        String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                this.type, this.brand, this.color, this.horsepower);
        return result;
    }
}

