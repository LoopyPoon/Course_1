package JavaRush.Level1;

import java.util.Arrays;

/*
Сортировка массива
*/

public class Array_sort {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
