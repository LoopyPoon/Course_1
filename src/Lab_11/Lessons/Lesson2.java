package Lab_11.Lessons;

public class Lesson2 {

    public static String b = "";

    public static void main(String[] args) {
        System.out.println(fromIntToByte(375));
    }
    public static String fromIntToByte(int n) {
        if (n == 0) {
            return null;
        } else {
            fromIntToByte(n / 2);
            b += (n % 2);
            return b;
        }
    }
}
