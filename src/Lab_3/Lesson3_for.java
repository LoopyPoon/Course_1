package Lab_3;

import java.util.Scanner;
import java.util.Arrays;

public class Lesson3_for {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int[] array = new int[count];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
