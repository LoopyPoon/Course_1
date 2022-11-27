package Lab_1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year of bith: ");
        int year_of_birth = in.nextInt();

        int current_year = 2022;

        System.out.printf("Hi %s, your age is %d\n", name, (current_year - year_of_birth));
        in.close();
    }
}
