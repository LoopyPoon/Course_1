package Lab_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(array));

        int[] arrayResult = filterEvenNumbers(array);

        System.out.println("Filter array: " + Arrays.toString(arrayResult));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
