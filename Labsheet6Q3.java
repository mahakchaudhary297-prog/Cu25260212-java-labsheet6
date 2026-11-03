public class Labsheet6Q3 {
    public static void main(String[] args) {
        String str = "123a";
        try {
            int number = Integer.parseInt(str);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not contain a valid integer.");
        }
    }
}
