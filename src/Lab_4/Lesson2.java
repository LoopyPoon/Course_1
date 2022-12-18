package Lab_4;

/* Напишите программу, которая выводит в консольное окно прямоугольный треугольник */

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = scan.nextInt();
        String filler = "* ";
        System.out.println();

        for (int i = 1; i <= height; i++) {
            System.out.println(filler.repeat(i));
        }
    }
}
