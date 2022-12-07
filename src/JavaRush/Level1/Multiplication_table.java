package JavaRush.Level1;

/*
Таблица умножения
*/

public class Multiplication_table {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i+1) * (j+1);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i > 0) {System.out.print("\n");}
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
        }
    }
}
