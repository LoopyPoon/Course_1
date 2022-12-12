package Lab_3;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number from 1 to 7: ");
        int number = scan.nextInt();

        String day;
        switch (number) {
            case 1: day = "Monday";
                    break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
            default: day = "does not exist";
                break;
            }
        System.out.printf("Your day is: %s", day);
        }
    }
