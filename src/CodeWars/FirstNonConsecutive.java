package CodeWars;

public class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[] {1, 2, 3, 4, 6, 7, 8}));
    }
    static Integer find(final int[] array) {
        Integer numb = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] - array[i] >= 2) {
                    numb = array[j];
                    return numb;
                } else numb = null;
                i++;
            }
        }
        return numb;
    }
}
