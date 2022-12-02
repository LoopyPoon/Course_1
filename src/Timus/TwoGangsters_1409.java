package Timus;

import java.util.Scanner;

public class TwoGangsters_1409 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int s = (a + b) - 1;

        System.out.printf("%d %d", (s-a), (s-b));
    }
}
