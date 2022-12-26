package Lab_5;

public class Lesson5 {
    public static void main(String[] args) {
        Solution mySolution = new Solution(14);
        System.out.println("Number: " + mySolution.printNumber());
        mySolution.getNumber(22);
        System.out.println("Number: " + mySolution.printNumber());
        mySolution.getNumber(155);
        System.out.println("Number: " + mySolution.printNumber());
        mySolution.getNumber();
        System.out.println("Number: " + mySolution.printNumber());
    }
    static class Solution {
        private int number;
        public void getNumber(int i){
            System.out.println("Method with argument:");
            if (i > 100) number = 100;
            else  number = i;
        }
        public void getNumber(){
            System.out.println("Method without argument:");
            number = 0;
        }
        Solution(int number){
            System.out.println("Constructor:");
            this.getNumber(number);
        }
        public int printNumber(){
            return number;
        }
    }
}
