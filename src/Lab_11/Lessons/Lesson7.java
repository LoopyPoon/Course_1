package Lab_11.Lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson7 {
    public static void main(String[] args) {
        List<Integer> peopleArrayList = createList(100000);

//        System.out.println("List: " + peopleArrayList);
        long time = System.nanoTime();
        System.out.println("Remove List: " + peopleCount(peopleArrayList));
        time = System.nanoTime() - time;
        System.out.printf("Время выполнения %,9.3f ms/n\n", time/1_000_000.0);

        List<Integer> peopleLinkedList = createLinkedList(1000);
//        System.out.println("Linked List: " + peopleLinkedList);
        time = System.nanoTime();
        System.out.println("Remove Linked List: " + peopleCount(peopleLinkedList));
        time = System.nanoTime() - time;
        System.out.printf("Время выполнения %,9.3f ms/n\n", time/1_000_000.0);
    }
    public static List<Integer> createList(int n) {
        List<Integer> peopleList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            peopleList.add(i);
        }
        return peopleList;
    }
    public static List<Integer> createLinkedList(int n) {
        List<Integer> peopleList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            peopleList.add(i);
        }
        return peopleList;
    }
    public static List<Integer> peopleCount(List<Integer> peopleList) {
        while (peopleList.size() != 1) {
            for (int i = 1; i < peopleList.size(); i ++) {
                peopleList.remove(i);
            }
        }
        return peopleList;
    }
}
