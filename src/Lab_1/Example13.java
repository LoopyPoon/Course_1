package Lab_1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = in.nextInt();

        System.out.print("Input second number: ");
        int b = in.nextInt();

        System.out.printf("Sum is: %d\n", (a + b));
        in.close();
    }
}
