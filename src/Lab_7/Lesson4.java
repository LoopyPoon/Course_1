package Lab_7;

/*
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии
 */

public class Lesson4 {
    char symbol;
    Lesson4(char ch) {
        this.symbol = ch;
    }
    Lesson4(Lesson4 Les4) {
        symbol = Les4.symbol;
    }
}
class subLesson4 extends Lesson4 {
    String text;
    subLesson4(char ch, String s) {
        super(ch);
        this.text = s;
    }
    subLesson4(subLesson4 subLes4) {
        super(subLes4);
        text = subLes4.text;
    }
}
class secondSubLesson4 extends subLesson4 {
    int number;
    secondSubLesson4(char ch, String s, int num) {
        super(ch, s);
        this.number = num;
    }
    secondSubLesson4(secondSubLesson4 secondSubLes4) {
        super(secondSubLes4);
        number = secondSubLes4.number;
    }
}