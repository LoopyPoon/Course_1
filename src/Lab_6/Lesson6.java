package Lab_6;

/*
Напишите программу со статическим методом, которому аргументом передается
целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
массив, который получается из исходного массива (переданного первым аргументом
методу), если в нем взять несколько начальных элементов. Количество элементов, которые
нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
аргумент метода больше длины массива, переданного первым аргументом, то методом
создается копия исходного массива и возвращается ссылка на эту копию.
 */

import java.util.Arrays;

public class Lesson6 {
    static int[] GetArray(int[] a, int n){
        if (n > a.length) {
            int[] NewArray = Arrays.copyOf(a, a.length);
            return NewArray;
        } else {
            return Arrays.copyOf(a, n);
        }
    }

    public static void main(String[] args) {
        System.out.println("New array if n > array: " + Arrays.toString(GetArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 20)));
        System.out.println("New array if n <= array: " + Arrays.toString(GetArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5)));
    }
}
