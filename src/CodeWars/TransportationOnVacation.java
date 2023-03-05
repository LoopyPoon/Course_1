package CodeWars;

public class TransportationOnVacation {
    public static void main(String[] args) {
        System.out.println(rentalCarCost(1));
        System.out.println(rentalCarCost(3));
        System.out.println(rentalCarCost(7));
    }
    public static int rentalCarCost(int d) {
        return (d >= 7) ? ((d * 40) - 50) : (d >= 3) ? ((d * 40) - 20) : (d * 40);
    }
}
