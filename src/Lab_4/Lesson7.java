package Lab_4;

/*
Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
сначала первая строка (слева направо), затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.
*/

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input size of the array: ");
        int size = scan.nextInt();
        int[][] array = new int[size][size];

        System.out.println();
        System.out.println("array:\n-----------------------");

        int startLine = 0, finishLine = size - 1, startColumn = 0, finishColumn = size - 1;
        int count = 0;
        int max = size * size;

        while (count < max) {
            for (int j = startColumn; j <= finishColumn; j++) {
                array[startLine][j] = count;
                count++;
            }
            startLine += 1;
            for (int i = startLine; i <= finishLine; i++) {
                array[i][finishColumn] = count;
                count++;
            }
            finishColumn -= 1;
            for (int j = finishColumn; j >= startColumn; j--) {
                array[finishLine][j] = count;
                count++;
            }
            finishLine -= 1;
            for (int i = finishLine; i >= startLine; i--) {
                array[i][startColumn] = count;
                count++;
            }
            startColumn += 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%-5s", array[i][j]);
            }
            System.out.println();
        }
    }
}
