package Lab_3;

import java.util.Scanner;

public class Lesson2_switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input day of the week: ");
        String day = scan.nextLine();

        String number;
        switch (day) {
            case "Monday": number = "1";
                break;
            case "Tuesday": number = "2";
                break;
            case "Wednesday": number = "3";
                break;
            case "Thursday": number = "4";
                break;
            case "Friday": number = "5";
                break;
            case "Saturday": number = "6";
                break;
            case "Sunday": number = "7";
                break;
            default: number = "does not exist";
                break;
        }
        System.out.printf("Your day is: %s of the week", number);
    }
}
