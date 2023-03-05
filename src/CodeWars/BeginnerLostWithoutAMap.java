package CodeWars;


import java.util.Arrays;

public class BeginnerLostWithoutAMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3, 4})));
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }
}
