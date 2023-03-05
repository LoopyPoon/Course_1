package CodeWars;

public class CalculateAverage {
    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 2, 3}));
    }

    public static double find_average(int[] array) {
        double sum = 0;
        for (int a : array) {
            sum += a;
        }
        return (sum / array.length);
    }
}
