import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRentalSystem {
    private List<Car> cars = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
    private double totalRevenue = 0;
    private Map<String, Integer> carRentalCount = new HashMap<>();
    private int customerIdCounter = 100;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public boolean rentCar(int carId, String customerName, String customerPhone, LocalDateTime start, LocalDateTime end) {
        for (Car car : cars) {
            if (car.getCarId() == carId && car.isAvailable()) {
                car.markAsRented();
                int customerId = customerIdCounter++;
                double rentalAmount = calculateRentalAmount(car, start, end);

                Rental rental = new Rental(carId, customerId, start, end, rentalAmount);
                rentals.add(rental);
                totalRevenue += rentalAmount;

                carRentalCount.put(car.getModel(), carRentalCount.getOrDefault(car.getModel(), 0) + 1);

                System.out.println("Car rented successfully!");
                System.out.printf("Customer ID: %d, Car ID: %d, Rental Amount: %.2f\n", customerId, carId, rentalAmount);
                return true;
            }
        }
        System.out.println("Car not available!");
        return false;
    }

    private double calculateRentalAmount(Car car, LocalDateTime start, LocalDateTime end) {
        long hours = Duration.between(start, end).toHours();
        double rate = switch (car.getType()) {
            case "Luxury" -> 100;
            case "SUV" -> 75;
            default -> 50;
        };
        return hours * rate;
    }

    public void showAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.printf("Car ID: %d, Model: %s, Type: %s\n", car.getCarId(), car.getModel(), car.getType());
            }
        }
    }

    public void printRentalDetails() {
        System.out.println("Rental Details:");
        for (Rental rental : rentals) {
            System.out.printf("Rental ID: %d, Car ID: %d, Customer ID: %d, Total Amount: %.2f\n",
                    rental.getRentalId(), rental.getCarId(), rental.getCustomerId(), rental.getTotalAmount());
        }
    }

    public double calculateTotalRevenue() {
        return totalRevenue;
    }

    public String getMostRentedCar() {
        return carRentalCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No rentals yet");
    }

    public void printBill(int rentalId) {
        for (Rental rental : rentals) {
            if (rental.getRentalId() == rentalId) {
                System.out.printf("Customer ID: %d, Car ID: %d, Rental Period: %s to %s, Total Amount: %.2f\n",
                        rental.getCustomerId(), rental.getCarId(),
                        rental.getRentalStart().format(DATE_FORMATTER),
                        rental.getRentalEnd().format(DATE_FORMATTER),
                        rental.getTotalAmount());
            }
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
