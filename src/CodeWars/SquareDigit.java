package CodeWars;

import java.util.Arrays;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder("" + n);
        int l = sb.length();
        int[] array = new int[l];
        String str = "";
        for (int i = 0, k = 1; i < array.length; i++, k++) {
            array[i] = n / ((int) Math.pow(10, l - k));
            array[i] %= 10;
            array[i] = (int) Math.pow(array[i], 2);
            str += array[i];
        }
        return Integer.parseInt(str);
    }
}
