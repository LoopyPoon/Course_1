package Lab_4;

/* Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник */

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = scan.nextInt();
        String filler = "*";

        String[][] array = new String[size][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new String[i + 1];
            for (int j = 0; j < i+1; j++) {
                array[i][j] = filler;
                System.out.print(array[i][j] + " ");
            }
        System.out.println();
        }
    }
}
