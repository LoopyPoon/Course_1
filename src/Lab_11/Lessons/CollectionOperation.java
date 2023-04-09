package Lab_11.Lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            List.add(i);
        }
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        linkedList.addAll(List);
        arrayList.addAll(List);

        addBegin(linkedList);
        addBegin(arrayList);
        System.out.println("addBegin");

        addMiddle(linkedList);
        addMiddle(arrayList);
        System.out.println("addMiddle");

        addEnd(linkedList);
        addEnd(arrayList);
        System.out.println("addEnd");

        measureTime(linkedList);
        measureTime(arrayList);
        System.out.println("measureTime");

        removeBegin(linkedList);
        removeBegin(arrayList);
        System.out.println("removeBegin");

        removeMiddle(linkedList);
        removeMiddle(arrayList);
        System.out.println("removeMiddle");

        removeEnd(linkedList);
        removeEnd(arrayList);
        System.out.println("removeEnd");

        addEnd(linkedList);
        addEnd(arrayList);
        System.out.println("addEnd");

    }

    private static void addBegin(List<Integer> list) {
        int j = 1;
        long start = System.currentTimeMillis();
        list.add(0, j);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static void addMiddle(List<Integer> list) {
        int j = 1;
        long start = System.currentTimeMillis();
        list.add(list.size() / 2, j);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void addEnd(List<Integer> list) {
        int j = 1;
        long start = System.currentTimeMillis();
        list.add(j);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void removeBegin(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void removeMiddle(List<Integer> list) {
        int j = list.size() / 2;
        long start = System.currentTimeMillis();
        list.remove(j);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void removeEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
