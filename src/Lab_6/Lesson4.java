package Lab_6;

/*
Напишите программу, в которой описан статический метод для вычисления
двойного факториала числа, переданного аргументом методу. По определению, двойной
факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
Предложите версию метода без рекурсии и с рекурсией.

 */

public class Lesson4 {
    static int Factorial(int n) {
        int fact = 1;
        for (int i = n; i != 0; i--) {
            fact *= i;
        }
        return fact;
    }
    static int FactorialRecurs(int n) {
        int fact;
        if (n == 1) return 1;
        fact = FactorialRecurs(n - 1) * n;
        return fact;
    }
    static int doubleFactorial(int n) {
        int fact = 1;
        if (n % 2 == 0) {
            for (int i = n; i >= 1; i--) {
                fact *= i;
                i--;
            }
        } else {
            for (int i = n; i >= 2; i--) {
                fact *= i;
                i--;
            }
        }
        return fact;
    }
    static int doubleFactorialRecurs(int n){
        int fact;
        if (n <= 1) return 1;
        fact = doubleFactorialRecurs(n - 2) * n;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + Lesson4.Factorial(6));
        System.out.println("Factorial with recurs: " + Lesson4.FactorialRecurs(6));
        System.out.println("Double factorial: " + Lesson4.doubleFactorial(6));
        System.out.println("Double factorial recurs: " + Lesson4.doubleFactorialRecurs(5));
    }
}
