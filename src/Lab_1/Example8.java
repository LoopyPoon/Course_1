package Lab_1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input day: ");
        String day = in.nextLine();

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input date: ");
        int date = in.nextInt();

        System.out.printf("Today is: %s %d %s \n", day, date, month);
        in.close();
    }
}
