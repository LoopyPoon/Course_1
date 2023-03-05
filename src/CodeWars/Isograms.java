package CodeWars;

public class Isograms {
    public static void main(String[] args) {
//        System.out.println(isIsogram("Dermatoglyphics"));
//        System.out.println(isIsogram("moose"));
//        System.out.println(isIsogram("aba"));
        isIsogram2("Dermatoglyphics");
    }
    public static boolean isIsogram(String str) {
        String s = str.toLowerCase();
        boolean boo = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    boo = false;
                    return boo;
                } else boo = true;
            }
        }
        return boo;
    }
    public static void isIsogram2(String str) {
        System.out.println(str.chars().distinct());
    }
}
