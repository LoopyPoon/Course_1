package Timus;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseRoot_1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Long> deque = new LinkedList<>();

        while (scan.hasNextLong()) {
            deque.addFirst(scan.nextLong());
        }

        for (Long l : deque) {
            System.out.printf("%.4f\n", Math.sqrt(l));
        }
    }
}
