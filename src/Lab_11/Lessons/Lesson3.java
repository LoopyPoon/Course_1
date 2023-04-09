package Lab_11.Lessons;

import java.util.Arrays;

public class Lesson3 {

    public static int[] arr = new int[25];

    public static void main(String[] args) {
        int l = arr.length - 1;
        System.out.println(Arrays.toString(setArray(l)));
    }
    public static int[] setArray(int n) {
        if (n == 0) {
            return arr;
        } else {
            setArray(n - 1);
            arr[n] = n;
        }
        return arr;
    }
}
