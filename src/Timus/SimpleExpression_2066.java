package Timus;

import java.util.Scanner;

public class SimpleExpression_2066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result1 = a - b * c;
        int result2 = a - b - c;

        if (result1 < result2) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }
}
