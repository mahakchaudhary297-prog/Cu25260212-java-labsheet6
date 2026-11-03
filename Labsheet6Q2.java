import java.util.Scanner;

public class Labsheet6Q2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an array index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter an index between 0 and 4.");
        } finally {
            scanner.close();
        }
    }
}
