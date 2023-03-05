package CodeWars;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel2("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        String[] ao = new String[]{"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        for (int i = 0; i < ao.length; i++) {
            str = str.replace(ao[i], "");
        }
        return str;
    }

    public static String disemvowel2(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
