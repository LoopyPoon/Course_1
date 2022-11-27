package Lab_1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = in.nextInt();

        int year = 2022;

        System.out.printf("Your birth year is: %d\n", (year - age));
        in.close();
    }
}
