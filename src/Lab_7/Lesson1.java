package Lab_7;

/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей.
 */

public class Lesson1 {
    private String str1;

    Lesson1(String strEx) {
        this.str1 = strEx;
    }
    Lesson1(){
    }
    @Override
    public String toString() {
        String strClassValue;
        strClassValue = "super\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1: " + this.getStr1();
        return strClassValue;
    }

    public String getStr1() {
        return str1;
    }
}
class subLesson1 extends Lesson1{
    private String str2;
    private String str3;
    subLesson1(String strEx){
        super(strEx);
    }
    subLesson1(String strEx2, String strEx3){
        this.str2 = strEx2;
        this.str3 = strEx3;
    }
    @Override
    public String toString(){
        String subStrClassValue;
        subStrClassValue = "sub\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1: " + this.getStr1() + "\n" +
                "str2: " + this.str2 + "\n" +
                "str3: " + this.str3;
        return subStrClassValue;
    }
}

