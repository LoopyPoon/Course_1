package Lab_3;

import java.util.Scanner;

public class Lesson2_ifElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input day of the week: ");
        String day = scan.nextLine();

        if (day.equals("Monday")) {
            System.out.print("Your day 1 of the week");
        } else if (day.equals("Tuesday")) {
            System.out.print("Your day 2 of the week");
        } else if (day.equals("Wednesday")) {
            System.out.print("Your day 3 of the week");
        } else if (day.equals("Thursday")) {
            System.out.print("Your day 4 of the week");
        } else if (day.equals("Friday")) {
            System.out.print("Your day 5 of the week");
        } else if (day.equals("Saturday")) {
            System.out.print("Your day 6 of the week");
        } else if (day.equals("Sunday")) {
            System.out.print("Your day 7 of the week");
        } else {
            System.out.print("Your day of the week does not exist!");
        }
    }
}
