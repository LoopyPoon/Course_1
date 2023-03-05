package CodeWars;

public class ANeedleInTheHaystack {
    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }

    public static String findNeedle(Object[] haystack) {
        String s = "found the needle at position ";
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") index = i;
        }
        String ind = Integer.toString(index);
        s += index;
        return s;
    }
}
