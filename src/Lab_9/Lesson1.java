package Lab_9;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input array size: ");
        int l = scan.nextInt();
        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            try {
                System.out.print("Input number № " + (i + 1) + ": ");
                if (scan.hasNextInt()) {
                    int n = scan.nextInt();
                    array[i] = n;
                } else {
                    throw new Exception("Wrong type value entered");
                }
            } catch (InputMismatchException e) {
                System.out.println("The string has been entered, number was expected: " + e);
                scan.close();
            }
            catch (Exception e) {
                System.out.println("Wrong type value entered: " + e);
                scan.close();
            } finally {
                scan.close();
            }
        }

        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num > 0) {
                sum += num;
                count += 1;
            }
        }

        int result = 0;

        try {
            result = sum / count;
        } catch (ArithmeticException e) {
            System.out.println("No positive elements: " + e);
        } finally {
            System.out.println(result);
        }


    }
}
