package Timus;

import java.util.Scanner;

public class AboutGrishaN_2012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int task = 12;
        task -= f;

        if ((task*45) <= 240) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
