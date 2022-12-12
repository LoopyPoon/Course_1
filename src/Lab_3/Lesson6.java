package Lab_3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Random random = new Random();
        int[] array;

        if (size > 0) {
            array = new int[size];
            int i = 0;
            while (i < size) {
                int num = random.nextInt(1000);
                if (num % 5 == 2) {
                    array[i] = num;
                    i++;
                }
            }
        System.out.print(Arrays.toString(array));
        } else {
            System.out.print("Incorrect value");
        }
    }
}
