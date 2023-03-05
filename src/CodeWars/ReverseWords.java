package CodeWars;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("   "));
        System.out.println(reverseWords("double  spaced  words"));
    }
    public static String reverseWords(final String original) {
        String[] array;
        if (original.isBlank()) {
            array = original.split("\\s-");
        } else {
            array = original.split("\\s");
        }

        String[] reverseArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            int il = array[i].length() - 1;
            if (array[i].equals("")) {reverseArray[i] = "";}
            for (int j = 0; j < array[i].length(); j++) {
                if (reverseArray[i] == null) {
                    reverseArray[i] = "" + array[i].charAt(il - j);
                } else {
                    reverseArray[i] += "" + array[i].charAt(il - j);
                }
            }
        }
        return String.join(" ",reverseArray);
    }
}
