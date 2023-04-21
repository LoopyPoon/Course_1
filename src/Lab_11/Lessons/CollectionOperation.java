package Lab_11.Lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            List.add(i);
        }
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        linkedList.addAll(List);
        arrayList.addAll(List);
        treeSet.addAll(List);

        System.out.println("addBegin");
        addBegin(linkedList);
        addBegin(arrayList);

        System.out.println("\naddMiddle");
        addMiddle(linkedList);
        addMiddle(arrayList);

        System.out.println("\naddEnd");
        addEnd(linkedList);
        addEnd(arrayList);
        addTree(treeSet);

        System.out.println("\nmeasureTime");
        measureTime(linkedList);
        measureTime(arrayList);
        getTree(treeSet);

        System.out.println("\nremoveBegin");
        removeBegin(linkedList);
        removeBegin(arrayList);
        removeTree(treeSet);

        System.out.println("\nremoveMiddle");
        removeMiddle(linkedList);
        removeMiddle(arrayList);

        System.out.println("\nremoveEnd");
        removeEnd(linkedList);
        removeEnd(arrayList);

    }

    private static void addBegin(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(0, j);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);

    }

    private static void addMiddle(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(list.size() / 2, j);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void addEnd(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(j);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void removeBegin(List<Integer> list) {
        long start = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void removeMiddle(List<Integer> list) {
        int j = list.size() / 2;
        long start = System.nanoTime();
        list.remove(j);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void removeEnd(List<Integer> list) {
        long start = System.nanoTime();
        list.remove(list.size() - 1);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void addTree(TreeSet<Integer> treeSet) {
        int j = 1;
        long start = System.nanoTime();
        treeSet.add(j);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void removeTree(TreeSet<Integer> treeSet) {
        long start = System.nanoTime();
        treeSet.remove(15);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }

    private static void getTree(TreeSet<Integer> treeSet) {
        long start = System.nanoTime();
        treeSet.subSet(0, 1000000);
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000.0);
    }
}
