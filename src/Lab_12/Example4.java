package Lab_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println("List: " + numbers);

        List<Integer> sqList = squareList(numbers);
        System.out.println("Square List: " + sqList);

        List<Integer> divideList = divideWithoutRem(numbers, 3);
        System.out.println("Divide List: " + divideList);

        List<Integer> greaterList = greaterThenValue(numbers, 444);
        System.out.println("Greater then value List: " + greaterList);

        List<Integer> lessList = lessThenValue(numbers, 444);
        System.out.println("Less then value List: " + lessList);
    }

    public static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public static List<Integer> divideWithoutRem(List<Integer> integerList, int number) {
        return integerList.stream().filter(x -> x % number == 0).collect(Collectors.toList());
    }

    public static List<Integer> greaterThenValue(List<Integer> integerList, int number) {
        return integerList.stream().filter(x -> x > number).collect(Collectors.toList());
    }

    public static List<Integer> lessThenValue(List<Integer> integerList, int number) {
        return integerList.stream().filter(x -> x < number).collect(Collectors.toList());
    }
}
