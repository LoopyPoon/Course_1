package Lab_12;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String str = "Напиши1те функцию, которая принимает на вход список строк и возвр2ащает новый список, " +
                "содержащий тол3ько те строки, которые начинаются с большой буквы";

        List<String> strings = List.of(str.split(" "));

        System.out.println("\n" + "Строка после сплита: " + "\n");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> capList = filterCapitalizedString(strings);
        System.out.println("\n" + "Capitalized List:" + "\n");
        for (String s : capList) {
            System.out.println(s);
        }

        List<String> subList = containsSubstring(strings, "стро");
        System.out.println("\n" + "Substring List:" + "\n");
        for (String s : subList) {
            System.out.println(s);
        }

        List<String> byLengthList = getValueByLength(strings, 7);
        System.out.println("\n" + "Value by length List:" + "\n");
        for (String s : byLengthList) {
            System.out.println(s);
        }

        List<String> onlyWordsList = getOnlyWords(strings);
        System.out.println("\n" + "Words only List:" + "\n");
        for (String s : onlyWordsList) {
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedString(List<String> stringList) {
        return stringList.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<String> containsSubstring(List<String> stringList, String str) {
        return stringList.stream().filter(x -> x.contains(str)).collect(Collectors.toList());
    }

    public static List<String> getValueByLength(List<String> stringList, int l) {
        return stringList.stream().filter(x -> x.length() > l).collect(Collectors.toList());
    }

    public static List<String> getOnlyWords(List<String> stringList) {
        return stringList.stream().filter(x -> x.chars().allMatch(Character::isLetter)).collect(Collectors.toList());
    }
}
