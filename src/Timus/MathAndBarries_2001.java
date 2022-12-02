package Timus;

import java.util.Scanner;

public class MathAndBarries_2001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int a3 = scan.nextInt();
        int b3 = scan.nextInt();

        System.out.println((a1 - a3) + " " + (b1 - b2));
    }
}
