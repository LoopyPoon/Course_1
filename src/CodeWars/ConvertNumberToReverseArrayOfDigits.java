package CodeWars;

import java.util.Arrays;

public class ConvertNumberToReverseArrayOfDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray1(12345)));
    }

    public static int[] reverseArray1(long number) {
        char arrayNum[] = ("" + number).toCharArray();
        int reverseNum[] = new int[arrayNum.length];
        for (int i = 0; i < arrayNum.length; i++) {
            reverseNum[i] = arrayNum[(arrayNum.length - 1) - i] - 48;
        }
        return reverseNum;
    }
}
