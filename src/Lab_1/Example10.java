package Lab_1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int current_year = 2022;

        System.out.print("Input year of birth: ");
        int year_of_birth = in.nextInt();

        System.out.print("Your age: " + (current_year - year_of_birth));
        in.close();
    }
}
