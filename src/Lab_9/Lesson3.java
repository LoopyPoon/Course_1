package Lab_9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter length of array: ");
        int length = scan.nextInt();
        byte[] byteArray = getByteArray(length);
        System.out.println(Arrays.toString(byteArray));
        System.out.println("Sum of array: " + getSumOfByteArray(byteArray));
    }

    public static byte[] getByteArray(int l) {
        byte[] array = new byte[l];
        for (int i = 0; i < l; i++) {
            try {
                System.out.print("Enter number № " + (i + 1) + ": ");
                int b = scan.nextInt();
                if (b < -128 || b > 127) {
                    throw new InputMismatchException("Out of range");
                } else array[i] = (byte) b;
            } catch (InputMismatchException e) {
                System.out.println("The string has been entered, number was expected: " + e);
                array[i] = 0;
            }
        }
        return array;
    }

    public static int getSumOfByteArray(byte[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
