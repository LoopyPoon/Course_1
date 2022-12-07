package JavaRush.Level1;

/*
Треугольный массив
*/

public class Triangular_array {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        //array[7][3] = 7 + 3 = 10,
        //array[3][0] = 3 + 0 = 3.

        //int[][] array = new int[10][];
        //array[0] = new int[1];
        //array[1] = new int[2];
        //array[2] = new int[3];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
