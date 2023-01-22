package Timus;

import java.util.Scanner;

public class WeddingDinner_2100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 2;
        int n = scan.nextInt();
        String s = scan.nextLine();
        for (int i = 0; i < n; i++) {
            s = scan.nextLine();
            count += 1;
            if (s.contains("+one")) {
                count += 1;
            }
        }
        if (count == 13) {
            count += 1;
        }
        int result = count * 100;
        System.out.println(result);
    }
}
