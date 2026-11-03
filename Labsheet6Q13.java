import java.util.Scanner;

class InvalidDosageException extends Exception {
    public InvalidDosageException(String message) {
        super(message);
    }
}

public class Labsheet6Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patientName = scanner.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = scanner.nextLine();

            System.out.print("Enter dosage in mg: ");
            String dosageStr = scanner.next();
            double dosage = Double.parseDouble(dosageStr);

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage must be between 1 mg and 1000 mg.");
            }

            System.out.println("Dosage valid for " + patientName + " taking " + drugName + ": " + dosage + " mg");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input for dosage.");
        } catch (InvalidDosageException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation is completed.");
            scanner.close();
        }
    }
}
