package Lab_6;

/*
Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2+2^2+3^2+...+n^2. Число n передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 1^2+2^2+3^2+...+n^2=(n+l) (2n + 1)/6
 */

public class Lesson5 {
    static int SumSquare(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }
    static int SumSquareRecurs(int n) {
        int result;
        if (n == 1) return 1;
        result = SumSquareRecurs(n-1) + (int) Math.pow(n,2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + Lesson5.SumSquare(6));
        System.out.println("Result with recurs: " + Lesson5.SumSquareRecurs(6));
    }
}
