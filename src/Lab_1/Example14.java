package Lab_1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = in.nextInt();

        int previous_a = (a - 1);
        int next_a = (a + 1);
        int sum_a = ((a - 1) + a + (a + 1));
        double square_a = Math.pow(sum_a, 2);

        System.out.printf("""
                Previous number: %d
                Number: %d
                Next number: %d
                Square of the sum of number: %.0f
                """, previous_a, a, next_a, square_a);
        in.close();
    }
}
