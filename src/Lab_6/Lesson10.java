package Lab_6;

/*
Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу.
 */

import java.util.Arrays;

public class Lesson10 {
    static int[] getMaxMinAvg(int ... a){
        int[] newArray = new int[2];
        int max = a[0];
        int min = a[0];
        for (int i : a){
            if (i > max) max = i;
            else if (i < min) min = i;
        }
        newArray[0] = max;
        newArray[1] = min;
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println("Array with max and min value: " + Arrays.toString(getMaxMinAvg(5,1,6,4,9,2,12,2,5,7)));
    }
}
