package CodeWars;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(6));
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
