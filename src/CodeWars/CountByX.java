package CodeWars;

import java.util.Arrays;

public class CountByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println(Arrays.toString(countBy(2,5)));
    }
    public static int[] countBy(int x, int n) {
        int[] arr = new int[n];
        for (int i = 0, c = x; i < n; i++) {
            arr[i] = c * (i + 1);
        }
        return arr;
    }
}
