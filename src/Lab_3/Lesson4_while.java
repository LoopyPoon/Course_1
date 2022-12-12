package Lab_3;

import java.util.Scanner;

public class Lesson4_while {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input 2 numbers: ");
        int a = scan.nextInt(), b = scan.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }


        while (a != b + 1) {
            System.out.print(a + " ");
            a++;
        }
    }
}
