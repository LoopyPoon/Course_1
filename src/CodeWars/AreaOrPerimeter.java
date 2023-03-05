package CodeWars;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter2(6, 10));
        System.out.println(areaOrPerimeter2(3, 3));

    }

    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;
        } else return (l + w) * 2;
    }

    public static int areaOrPerimeter2(int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }
}
