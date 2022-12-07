package JavaRush.Level1;

/*
Работаем с элементами массива
*/

public class Working_with_array_elements {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            if (array[i] % 2 == 0)
                array[i] = array[i] * -1;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
