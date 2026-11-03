import java.util.Scanner;

class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}

public class Labsheet6Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter medicine name: ");
            String medicineName = scanner.nextLine();

            System.out.print("Enter available quantity: ");
            String availStr = scanner.next();
            int availableQty = Integer.parseInt(availStr);

            System.out.print("Enter required quantity: ");
            String reqStr = scanner.next();
            int requiredQty = Integer.parseInt(reqStr);

            if (requiredQty < 0) {
                System.out.println("Error: Required quantity cannot be negative.");
            } else if (requiredQty > availableQty) {
                throw new InsufficientStockException("Insufficient stock available for " + medicineName);
            } else {
                availableQty -= requiredQty;
                System.out.println("Order processed successfully. Remaining stock for " + medicineName + ": " + availableQty);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input entered.");
        } catch (InsufficientStockException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Inventory check completed.");
            scanner.close();
        }
    }
}
