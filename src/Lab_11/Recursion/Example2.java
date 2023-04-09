package Lab_11.Recursion;

public class Example2 {
    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x) {
        if ((x * 2 + 1) < 20) {
            m(x * 2 + 1);
        }
        System.out.println("x = " + x);
    }
}
