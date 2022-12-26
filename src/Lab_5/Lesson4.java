package Lab_5;

public class Lesson4 {
    public static void main(String[] args) {
        complexNumber myNumber1 = new complexNumber(22, 'A');
        complexNumber myNumber2 = new complexNumber(70.1777);
    }
    static class complexNumber{
        private char ch;
        private int number;
        complexNumber(int num, char c){
            this.ch = c;
            this.number = num;
            int lengthNum = String.valueOf(number).length();
            double res = (int) ch + (double) number / Math.pow(10, lengthNum);
            System.out.println("Result: " + res);
        }
        complexNumber(double d){
            char ch = (char) d;
            number = (int) ((d - (int) d) * 100);
            System.out.printf("Symbol: %c\nNumber: %d", ch, number);
        }
    }
}
