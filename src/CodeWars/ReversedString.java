package CodeWars;

public class ReversedString {
    public static void main(String[] args) {
        System.out.println(reverseString1("hello"));
        System.out.println(reverseString2("world"));
        System.out.println(reverseString3("Java"));
        System.out.println(reverseString4("recurse"));
        System.out.println(reverseString5("logic"));
    }
    public static String reverseString1(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str = s.charAt(i) + str;
        }
        return str;
    }
    public static String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static String reverseString3(String s) {
        char array[] = s.toCharArray();
        String str = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str += array[i];
        }
        return str;
    }
    public static String reverseString4(String s) {
        String leftS;
        String rightS;

        if (s.length() <= 1) {
            return s;
        }

        leftS = s.substring(0,s.length()/2);
        rightS = s.substring(s.length()/2,s.length());

        return reverseString4(rightS) + reverseString4(leftS);
    }
    public static String reverseString5(String s) {
        char array[] = s.toCharArray();
        int low = 0;
        int high = array.length -1;
        String str = "";
        while (low < high) {
            array[low] = (char) (array[low] ^ array[high]);
            array[high] = (char) (array[low] ^ array[high]);
            array[low] = (char) (array[low] ^ array[high]);
            low++;
            high--;
        }
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        return str;
    }
}
