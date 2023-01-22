package Timus;

import java.util.Scanner;

public class Chocolate2_1639 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = (n*m)%2;
        System.out.println((a!=0)?("[second]=:]"):("[:=[first]"));
    }
}
