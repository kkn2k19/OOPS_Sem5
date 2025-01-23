public class Car {
    private int carId;
    private String model;
    private String type;
    private boolean isAvailable;

    public Car(int carId, String model, String type) {
        this.carId = carId;
        this.model = model;
        this.type = type;
        this.isAvailable = true;
    }

    public int getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void markAsRented() {
        this.isAvailable = false;
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }
}
