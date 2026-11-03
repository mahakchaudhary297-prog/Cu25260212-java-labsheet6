import java.util.Scanner;
public class Labsheet6Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            String numStr1 = scanner.next();
            System.out.print("Enter denominator: ");
            String numStr2 = scanner.next();
            
            int n1 = Integer.parseInt(numStr1);
            int n2 = Integer.parseInt(numStr2);
            int divisionResult = n1 / n2;
            System.out.println("Division result: " + divisionResult);

            int[] arr = {5, 10, 15, 20, 25};
            System.out.print("Enter array index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Array element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid number format.");
        } finally {
            scanner.close();
        }
    }
}
