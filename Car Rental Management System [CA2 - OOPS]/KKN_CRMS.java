import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KKN_CRMS {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();
        Scanner scanner = new Scanner(System.in);

        system.getCars().add(new Car(1, "Honda Civic", "Economy"));
        system.getCars().add(new Car(2, "BMW X5", "Luxury"));
        system.getCars().add(new Car(3, "Ford Explorer", "SUV"));

        boolean running = true;
        while (running) {
            System.out.println("1. Show available cars");
            System.out.println("2. Rent a car");
            System.out.println("3. Show rental details");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.showAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter rental start time (dd-MM-yyyy HH:mm): ");
                    LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), DATE_FORMATTER);
                    System.out.print("Enter rental end time (dd-MM-yyyy HH:mm): ");
                    LocalDateTime end = LocalDateTime.parse(scanner.nextLine(), DATE_FORMATTER);
                    system.rentCar(carId, name, phone, start, end);
                    break;
                case 3:
                    system.printRentalDetails();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
