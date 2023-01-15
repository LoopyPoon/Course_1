package Lab_7;

/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */

public class Lesson2 {
    Lesson2(String strEx) {
        str1 = strEx;
    }
    private String str1;
    public void setValue() {
    }
    public void setValue(String strEx) {
        this.str1 = strEx;
    }
    public int getStrLength() {
        return str1.length();
    }
}
class subLesson2 extends Lesson2 {
    subLesson2(int num, String strEx) {
        super(strEx);
        this.number = num;
    }
    int number;
    public void setValue() {
    }
    public void setValue(String strEx) {
        super.setValue(strEx);
    }
    public void setValue(int num) {
        this.number = num;
    }
    public void setValue(String strEx, int num) {
        super.setValue(strEx);
        this.number = num;
    }
}