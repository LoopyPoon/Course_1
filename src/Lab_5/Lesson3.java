package Lab_5;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int scanNum1 = scan.nextInt();
        System.out.print("Input number 2: ");
        int scanNum2 = scan.nextInt();
        Box myBox1 = new Box();
        Box myBox2 = new Box(scanNum1);
        Box myBox3 = new Box(scanNum1, scanNum2);
    }

    static class Box {

        private int number1 = 1;
        private int number2 = 2;

        Box(){
            System.out.println("Constructor of the object \"myBox1\"");
            System.out.println("number 1 * number 2: " + (number1 * number2));
        }

        Box(int number1) {
            System.out.println("Constructor of the object \"myBox2\"");
            this.number1 = number1;
            System.out.println("number 1 * number 2: " + (number1 * number2));
        }

        Box(int number1, int number2) {
            System.out.println("Constructor of the object \"myBox3\"");
            this.number1 = number1;
            this.number2 = number2;
            System.out.println("number 1 * number 2: " + (number1 * number2));
        }
    }
}
