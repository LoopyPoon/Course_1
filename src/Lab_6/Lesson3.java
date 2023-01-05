package Lab_6;

/*
Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.

 */

public class Lesson3 {
    static int Max(int ... a){
        int max;
        if (a.length == 0) return 0;
        max = a[0];
        for (int i:a){
            if (i > max) max = i;
        }
        return max;
    }
    static int Min(int ... a){
        int min;
        if (a.length == 0) return 0;
        min = a[0];
        for (int i:a){
            if (i < min) min = i;
        }
        return min;
    }
    static int Avg(int ...a){
        int avg;
        if (a.length == 0) return 0;
        int sum = 0;
        int count = 0;
        for (int i:a){
            sum += i;
            count += 1;
        }
        avg = sum / count;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + Lesson3.Max(3,4,6,8,123,56256,-1234,-156,0,5));
        System.out.println("Min: " + Lesson3.Min(3,4,6,8,123,56256,-1234,-156,0,5));
        System.out.println("Avg: " + Lesson3.Avg(3,4,6,8,123,56256,-1234,-156,0,5));
    }
}
