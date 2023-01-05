package Lab_6;

/*
Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.

 */

public class Lesson2 {

    private static int Number = 0;

    public static void Increment(int n){
        System.out.println("Number default: " + Number);
        Number = n;
        System.out.println("Number = n: " + Number);
        Number++;
        System.out.println("Increment number: " + Number);
    }

    public static void main(String[] args) {
        Increment(15);
    }
}
