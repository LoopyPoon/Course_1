package Lab_11.Lessons;

public class Lesson1 {
    public static int step = 0;

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 0) {
            step=0;
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int f1 = fib(n - 2);
            int f2 = fib(n - 1);
            space();
            step+=13;
            System.out.print(f1 + " -> ");
            int f = f1 + f2;
            System.out.print(f);
            System.out.println(" <- " + f2);
            return n;
        }
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
