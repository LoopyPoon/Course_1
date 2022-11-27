package Lab_1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input count a day in a month: ");
        int count = in.nextInt();

        System.out.printf("In %s: %d days\n", month, count);
        in.close();
    }
}
