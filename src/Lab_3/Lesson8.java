package Lab_3;

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {

        char[] array = new char[10];
        char[] vowel = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char c = 'A';
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (c == vowel[j]) {
                    c++;
                }
            }
            array[i] = c;
            c++;
        }
        System.out.print(Arrays.toString(array));
    }
}

