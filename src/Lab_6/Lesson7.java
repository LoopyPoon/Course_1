package Lab_6;

/*
Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента
 */

import java.util.Arrays;

public class Lesson7 {
    static int[] GetArray(char[] a) {
        int[] NewArray = new int[a.length];
        for (int i = 0; i < NewArray.length; i++) {
            NewArray[i] = (int) a[i];
        }
        return NewArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(GetArray(new char[]{'1','2','3','4','5','6','7','8','9','a','B','Z'})));
    }
}
