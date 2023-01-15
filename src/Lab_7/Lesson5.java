package Lab_7;

import javax.xml.transform.Source;

/*
Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.
 */
public class Lesson5 {
    protected String text;
    Lesson5(String s) {
        this.text = s;
    }
    public void printNameAndValue() {
        System.out.println(getClass().getSimpleName() + "\n" +
                "String: " + text);
    }
}
class sub1Lesson5 extends Lesson5 {
    protected int number;
    sub1Lesson5(String s, int num) {
        super(s);
        this.number = num;
    }
    @Override
    public void printNameAndValue() {
        super.printNameAndValue();
        System.out.println("Number: " + number);
    }
}
class sub2Lesson5 extends Lesson5 {
    protected char symbol;
    sub2Lesson5(String s, char ch) {
        super(s);
        this.symbol = ch;
    }
    @Override
    public void printNameAndValue() {
        super.printNameAndValue();
        System.out.println("Symbol: " + symbol);
    }
}
