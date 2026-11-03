public class Labsheet6Q9 {
    static void method3() {
        int a = 10 / 0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception successfully handled in main(): ArithmeticException caught.");
        }
    }
}
