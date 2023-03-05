package Lab_9;

public class Example14 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Array length = " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }

    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
        System.out.println(h);
    }
}
