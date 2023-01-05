package Lab_6;

/*
Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */

import java.util.Arrays;

public class Lesson8 {
    static double GetAvg(int[] a){
        double sum = 0;
        for (double i:a) sum+=i;
        double result = sum / a.length;
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("average: " + GetAvg(array));
    }
}
