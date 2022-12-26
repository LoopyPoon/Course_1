package Lab_5;

public class Lesson6 {
    public static void main(String[] args) {
        Solution mySolution = new Solution(14, 22);
        mySolution.printNumbers();
        Solution mySolution2 = new Solution(12);
        mySolution2.printNumbers();
        mySolution.setNumber(10, 26);
        mySolution.printNumbers();
        mySolution.setNumber(28);
        mySolution.printNumbers();
    }
    static class Solution{
        private static int min;
        private static int max;

        public void setNumber(int num1, int num2) {
            System.out.println("Method with 2 arguments:");
            min = Math.min(Math.min(num1, min), num2);
            max = Math.max(Math.max(num1, max), num2);
        }
        public void setNumber(int num){
            System.out.println("Method with 1 argument:");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        public void printNumbers(){
            System.out.printf("min: %d; ", min);
            System.out.printf("max: %d;\n", max);
        }
        Solution(int num1, int num2){
            System.out.println("Constructor with 2 arguments:");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }
        Solution(int num){
            System.out.println("Constructor with 2 arguments:");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
