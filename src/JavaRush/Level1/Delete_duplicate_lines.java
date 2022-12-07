package JavaRush.Level1;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Delete_duplicate_lines {
    public static String[] strings;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        strings = new String[6];

        for (int i=0; i<6; i++) {
            strings[i] = console.nextLine();
        }

        for (int i=0; i<strings.length; i++) {
            String str = strings[i];
            for (int j=i+1; j<strings.length; j++) {
                if (str == null) {
                    break;
                }
                if (str.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
