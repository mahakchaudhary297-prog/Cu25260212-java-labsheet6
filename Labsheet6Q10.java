import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Labsheet6Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter marks (0-100): ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks are outside the valid range 0–100.");
            }
            System.out.println("Marks recorded: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
