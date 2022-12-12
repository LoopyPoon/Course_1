package Lab_3;

import java.util.Arrays;
import java.util.Random;

public class Lesson10 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(200);
        int[] array = new int[size];
        int[] reverseArray = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        Arrays.sort(array);
        for (int i = 1; i <= reverseArray.length; i++) {
            reverseArray[i-1] = array[reverseArray.length - i];
        }
        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(reverseArray));
    }
}
