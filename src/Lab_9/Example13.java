package Lab_9;

public class Example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Array length = " + l);
            int h = 10 / l;
            args[h + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }
}
