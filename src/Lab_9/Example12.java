package Lab_9;

public class Example12 {
    public static void main(String[] args) {
        m(null, 0.000001);
    }

    public static void m(String str, double number) {
        if (str == null) {
            throw new IllegalArgumentException("String enter incorrectly");
        }
        if (number > 0.001) {
            throw new IllegalArgumentException("Incorrect number");
        }
    }
}
