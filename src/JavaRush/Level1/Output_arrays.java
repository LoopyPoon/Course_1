package JavaRush.Level1;

import java.util.Arrays;

/*
Выводим массивы
*/

public class Output_arrays {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(strings));
    }
}
