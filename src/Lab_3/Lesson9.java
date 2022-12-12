package Lab_3;

import java.util.Arrays;
import java.util.Random;

public class Lesson9 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(10, 2000)];

        int count = 0;
        int min = 9999;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                count += 1;
                System.out.printf("index: %d ", i);
            }
        }
        System.out.printf("\nnumber: %d \ncount: %d", min, count);
    }
}
