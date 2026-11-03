import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Labsheet6Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            String balStr = scanner.next();
            double balance = Double.parseDouble(balStr);

            System.out.print("Enter withdrawal amount: ");
            String amtStr = scanner.next();
            double amount = Double.parseDouble(amtStr);

            if (amount < 0) {
                System.out.println("Error: Withdrawal amount cannot be negative.");
            } else if (amount > balance) {
                throw new InsufficientBalanceException("Withdrawal amount exceeds available balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input provided.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
            scanner.close();
        }
    }
}
