import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Labsheet6Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();

            System.out.print("Enter patient age: ");
            String ageStr = scanner.next();
            int age = Integer.parseInt(ageStr);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Age must be between 0 and 120.");
            }

            System.out.println("Patient registered successfully: " + name + ", Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric input entered for age.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
