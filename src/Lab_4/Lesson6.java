package Lab_4;

/* Напишите программу, в которой создается и инициализируется двумерный числовой массив.
Затем из этого массива удаляется строка и столбец (создается новый массив,
в котором по сравнению с исходным удалена одна строка и один столбец).
Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел. */

import java.util.Random;
import java.util.Scanner;

public class Lesson6 {
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


        int del_line = random.nextInt(height - 1);
        int del_column = random.nextInt(width - 1);

        System.out.printf("delete line: %d, delete column: %d\n\n", del_line, del_column);
        System.out.println("new array:\n-----------------------");

        int[][] new_array = new int[height-1][width-1];
        for (int i = 0, l = 0; i < (height - 1); l++) {
            if (l != del_line) {
                for (int j= 0, c = 0; j < (width - 1); c++) {
                    if (c != del_column) {
                        new_array[i][j] = array[l][c];
                        System.out.printf("%-5s", new_array[i][j]);
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }
    }
}
