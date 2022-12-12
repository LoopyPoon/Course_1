package Lab_3;

public class Lesson7 {
    public static void main(String[] args) {

        char[] array = new char[10];

        char c = 'a';

        for (int i = 0; i < array.length; i++) {
            if (c % 2 == 1) {
                array[i] = c;
                c++;
                c++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 1; i <= array.length; i++) {
            System.out.print(array[array.length - i] + " ");
        }
    }
}
