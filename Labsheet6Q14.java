import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Labsheet6Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student marks: ");
            String marksStr = scanner.next();
            int marks = Integer.parseInt(marksStr);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Invalid marks. Must be between 0 and 100.");
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
            scanner.close();
        }
    }
}
