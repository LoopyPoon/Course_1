package JavaRush.Level1;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class Minimum_of_N_numbers {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }

        int min = array[0];

        for (int i=0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
