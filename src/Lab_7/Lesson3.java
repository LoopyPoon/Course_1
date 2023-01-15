package Lab_7;

/*
Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.
 */

public class Lesson3 {
    int number;
    public void setValue(int num) {
        this.number = num;
    }
    Lesson3(int num) {
        this.number = num;
    }
    @Override
    public String toString(){
        return "super\n" +
                "Class name: " + getClass().getSimpleName() + "\n" +
                "number: " + this.number;
    }
}
class subLesson3 extends Lesson3 {
    char symbol;
    public void setValue(char ch, int num) {
        this.symbol = ch;
        super.setValue(num);
    }
    subLesson3(char ch, int num) {
        super(num);
        this.symbol = ch;
    }
    @Override
    public String toString(){
        return "sub\n" +
                "Class name: " + getClass().getSimpleName() + "\n" +
                "number: " + super.number + "\n" +
                "symbol: " + this.symbol;
    }
}
class secondSubLesson3 extends subLesson3 {
    String text;
    public void setValue(int num, char ch, String s) {
        this.text = s;
        super.setValue(ch,num);
    }
    secondSubLesson3(String s, char ch, int num) {
        super(ch,num);
        this.text = s;
    }
    @Override
    public String toString(){
        return "second sub\n" +
                "Class name: " + getClass().getSimpleName() + "\n" +
                "number: " + super.number + "\n" +
                "symbol: " + super.symbol + "\n" +
                "string: " + this.text;
    }
}