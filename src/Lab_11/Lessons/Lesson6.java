package Lab_11.Lessons;

import java.util.HashMap;
import java.util.Map;

public class Lesson6 {
    public static void main(String[] args) {
        HashMap<Integer, String> idAndNames = new HashMap<>();

        idAndNames.put(0, "John");
        idAndNames.put(0, "Stew");
        idAndNames.put(1, "Bob");
        idAndNames.put(2, "Sam");
        idAndNames.put(3, "Jason");
        idAndNames.put(4, "Eva");
        idAndNames.put(5, "Stan");
        idAndNames.put(6, "Sofia");
        idAndNames.put(7, "Max");
        idAndNames.put(8, "Ann");
        idAndNames.put(9, "Jane");
        idAndNames.put(10, "Abraham");
        idAndNames.put(11, "Stefani");

        printKeyGreater5(idAndNames);
        printValuesEqual0(idAndNames);
        multiValuesGreater5(idAndNames);
    }
    public static void printKeyGreater5(HashMap<Integer, String> idAndNames) {
        for (Map.Entry<Integer, String> entry : idAndNames.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }
    }
    public static void printValuesEqual0(HashMap<Integer, String> idAndNames) {
        for (Map.Entry<Integer, String> entry : idAndNames.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.print(String.join(", ", entry.getValue()));
            }
        }
    }
    public static void multiValuesGreater5(HashMap<Integer, String> idAndNames) {
        int multi = 1;
        for (Map.Entry<Integer, String> entry : idAndNames.entrySet()) {
            if (entry.getValue().length() > 5) {
                multi *= entry.getKey();
                System.out.println(entry);
            }
        }
        System.out.println(multi);
    }
}
