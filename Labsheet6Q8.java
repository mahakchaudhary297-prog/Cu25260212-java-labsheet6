import java.util.Scanner;

public class Labsheet6Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        try {
            System.out.print("Enter numerator for division: ");
            int a = scanner.nextInt();
            System.out.print("Enter denominator for division: ");
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);

            try {
                System.out.print("Enter array index: ");
                int idx = scanner.nextInt();
                System.out.println("Element: " + arr[idx]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Invalid array index.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by zero error.");
        } finally {
            scanner.close();
        }
    }
}
