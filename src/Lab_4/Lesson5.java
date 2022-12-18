package Lab_4;

/* Напишите программу, в которой создается двумерный целочисленный массив. Он заполняется случайными числами.
Затем в этом массиве строи и столбцы меняются местами:
первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов. */

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.print("Input height of the array: ");
        int height = scan.nextInt();
        System.out.print("Input width of the array: ");
        int width = scan.nextInt();
        int[][] array = new int[height][width];

        System.out.println();
        System.out.println("array:\n-----------------------");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = random.nextInt(100);
                System.out.printf("%-5s", array[i][j]);
            }
        System.out.println();
        }

        System.out.println();
        System.out.println("reverse array:\n-----------------------");

        int[][] reverse_array = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                reverse_array[i][j] = array[j][i];
                System.out.printf("%-5s", reverse_array[i][j]);
            }
        System.out.println();
        }
    }
}
