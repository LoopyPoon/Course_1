package Lab_5;

public class Lesson1 {

    private char ch;

    public void getValue(char value) {
        ch = value;
    }

    public int getSymbol(int ch) {
        int Symbol = ch;
        return Symbol;
    }

    public void printCh() {
        System.out.printf("Value: %c, Code: %d", ch, getSymbol(ch));
    }

    public static void main(String[] args) {
        Lesson1 les = new Lesson1();
        les.getValue('b');
        les.printCh();
    }
}
