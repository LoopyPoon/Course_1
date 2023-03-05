package CodeWars;

public class QuarterOfTheYear {
    public static void main(String[] args) {
        System.out.println(quarterOf(4));
    }

    public static int quarterOf(int month) {
        switch (month) {
            case 1, 2, 3:
                return 1;
            case 4, 5, 6:
                return 2;
            case 7, 8, 9:
                return 3;
            case 10, 11, 12:
                return 4;
        }
        return 0;
    }
}
