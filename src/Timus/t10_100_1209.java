package Timus;

import java.util.Scanner;

public class t10_100_1209 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        for (long i = 0; i < n; i++) {
            long x = scan.nextLong() -1;
            long y = (long) Math.sqrt(8 * x + 1);
            if (y * y == (8 * x + 1)) {
                System.out.println("1 ");
            } else {
                System.out.println("0 ");
            }
        }
    }
}
