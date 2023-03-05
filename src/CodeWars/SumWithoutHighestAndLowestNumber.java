package CodeWars;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {6, 2, 1, 8, 10}));
        System.out.println(sum(new int[] {10, 9, 1, 2, 9, 10}));
        System.out.println(sum(new int[] {}));
        System.out.println(sum(new int[] {6, 0, 1, 10, 10}));
    }
    public static int sum(int[] numbers) {

        if (numbers==null || numbers.length<3) return 0;

        // sort the array
        java.util.Arrays.sort(numbers);

        // sum up elements excluding the first and last
        int sum = 0;
        for(int i=1;i<numbers.length-1;i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
