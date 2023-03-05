package CodeWars;

import java.util.Arrays;

public class SimpleMultiplication {
    public static void main(String[] args) {
        System.out.println(multiply(3));
        System.out.println(multiply(4));

        System.out.println(grow(new int[]{1,2,3,4,5,6}));
        System.out.println(grow(new int[]{4,1,1,1,1,4}));
    }
    public static int multiply(int n) {
        int result;
        if (n % 2 == 0) {
            result = n * 8;
        } else {
            result = n * 9;
        }
        return result;
    }
    public static int grow(int[] x) {
        int m = 1;
        for (int i : x) {
            m *= x[i] - 1;
        }
        return m;
    }
}
