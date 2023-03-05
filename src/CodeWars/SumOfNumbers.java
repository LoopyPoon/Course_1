package CodeWars;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSum(1,0));
        System.out.println(getSum(1,2));
        System.out.println(getSum(0,1));
    }
    public static int getSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        for (int i = b; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
