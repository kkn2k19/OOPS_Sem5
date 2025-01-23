import java.time.LocalDateTime;

public class Rental {
    private static int rentalIdCounter = 1;
    private int rentalId;
    private int carId;
    private int customerId;
    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;
    private double totalAmount;

    public Rental(int carId, int customerId, LocalDateTime rentalStart, LocalDateTime rentalEnd, double totalAmount) {
        this.rentalId = rentalIdCounter++;
        this.carId = carId;
        this.customerId = customerId;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
        this.totalAmount = totalAmount;
    }

    public int getRentalId() {
        return rentalId;
    }

    public int getCarId() {
        return carId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDateTime getRentalStart() {
        return rentalStart;
    }

    public LocalDateTime getRentalEnd() {
        return rentalEnd;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
