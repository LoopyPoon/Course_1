package CodeWars;

public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(twiceOld(30,7));
        System.out.println(twiceOld(45,30));
    }
    public static int twiceOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - (sonYears * 2));
    }
}
