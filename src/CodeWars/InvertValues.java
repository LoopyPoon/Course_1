package CodeWars;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1,2,-2,0,-4})));
    }
    public static int[] invert(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] * -1;
        }
        return resultArray;
    }
}
