package Lab_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(200);
            array2[i] = random.nextInt(200);
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] resultArray = findCommonElements(array1, array2);
        System.out.println("Result array: " + Arrays.toString(resultArray));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
    }
}
