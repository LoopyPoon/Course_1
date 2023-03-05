package Lab_9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the count of line: ");
        int line = scan.nextInt();
        System.out.print("Enter the count of column: ");
        int column = scan.nextInt();
        System.out.println();
        int[][] matrix = getMatrix(line, column);
        System.out.println();

        try {
            System.out.print("Enter column number to output: ");
            int [] array = getColumn(matrix, scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("The string has been entered, number was expected: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No column with that number: " + e);
        }

    }

    public static int[][] getMatrix(int line, int column) {
        int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 1000);
                System.out.printf("%-5s", matrix[i][j]);
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    public static int[] getColumn(int[][] matrix, int column) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][column - 1];
            System.out.printf("%-5s", matrix[i][column - 1]);
        }
        return array;
    }
}
