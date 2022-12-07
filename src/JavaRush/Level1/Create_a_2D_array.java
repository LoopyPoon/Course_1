package JavaRush.Level1;

import java.util.Scanner;

/*
Создаем двумерный массив
 */

public class Create_a_2D_array {
    public static int[][] multiArray;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        multiArray = new int[n][];

        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            multiArray[i] = new int[k];
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++)
                System.out.print( multiArray[i][j] + " " );
            System.out.println();
        }
    }
}
