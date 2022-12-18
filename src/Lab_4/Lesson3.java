package Lab_4;

/* Напишите программу, в которой создается двумерный массив, который выводит прямоугольник из цифр 2 */

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = scan.nextInt();

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j] + " ");
            }
        System.out.println();
        }
    }
}
