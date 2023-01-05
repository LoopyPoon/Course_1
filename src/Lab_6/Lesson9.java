package Lab_6;

/*
Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последн и м , второй — с предпоследним и так далее.
 */

import java.util.Arrays;

public class Lesson9 {
    static char[] SwapArray(char[] chars){
        char[] swapArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            swapArray[i] = chars[(chars.length - 1) - i];
        }
        return swapArray;
    }

    public static void main(String[] args) {
        char[] ch = {'1','2','a','Z','j','8'};
        System.out.println("array: " + Arrays.toString(ch));
        System.out.println("swap array: " + Arrays.toString(SwapArray(ch)));
    }
}
