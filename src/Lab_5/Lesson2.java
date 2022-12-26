package Lab_5;

public class Lesson2 {

    static class charArray{
        private char ch1;
        private char ch2;

        public void getCh(char ch1, char ch2){
            this.ch1 = ch1;
            this.ch2 = ch2;
        }

        public void printArray(int ch1, int ch2) {
            if (ch1 > ch2) {
                int ch3 = ch1;
                ch1 = ch2;
                ch2 = ch3;
            }
            for (int i = ch1; i <=ch2; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        charArray myArray = new charArray();
        myArray.getCh('Z','A');
        myArray.printArray(myArray.ch1, myArray.ch2);
    }
}
