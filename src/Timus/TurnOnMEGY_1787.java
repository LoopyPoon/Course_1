package Timus;

import java.util.Scanner;

public class TurnOnMEGY_1787 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(); //Количество машин успевающий повернуть в течении минуты
        int n = scan.nextInt(); //Количество минут прошедших с начала наблюдения
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            count += a - k;
            if (count < 0) {
                count = 0;
            }
        }
        System.out.println(count);
    }
}