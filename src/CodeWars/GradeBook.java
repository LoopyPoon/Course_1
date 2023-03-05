package CodeWars;

public class GradeBook {
    public static void main(String[] args) {
        System.out.println(getGrade(70,70,100));
    }
    public static char getGrade(int s1, int s2, int s3) {
        int abs = (s1 + s2 + s3) / 3;
        char c;
        if (90 <= abs & abs <= 100) {
            c = 'A';
        } else if (80 <= abs & abs < 90) {
            c = 'B';
        } else if (70 <= abs & abs < 80) {
            c = 'C';
        } else if (60 <= abs & abs < 70) {
            c = 'D';
        } else {
            c = 'F';
        }
        return c;
    }
}
