package Lab_4;

/* Напишите программу, которая выводить в консольное окно прямоугольник,
размеры сторон которого, ширина: 23 колонки, высота: 11 строк */

public class Lesson1 {
    public static void main(String[] args) {

        String filler = "*";
        int width = 23;
        int height = 11;
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(filler + " ");
            }
            System.out.println();
        }
    }
}
