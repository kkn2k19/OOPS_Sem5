class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numberOfDoors, int batteryCapacity) {
        super(make, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 3", 2022, 4, 75);
        System.out.println("\nElectric Car Details:");
        myElectricCar.displayInfo();
    }
}

