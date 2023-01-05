package Lab_6;

/*
Напишите программу с классом, в котором есть два ноля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений нолям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю.

 */

public class Lesson1 {
    public char Symbol;
    public String Text;
    void Set(char c) {
        Symbol = c;
    }
    void Set(String s) {
        Text = s;
    }
    void Set(char[] ch) {
        if (ch.length == 1) {
            Symbol = ch[0];
        } else if (ch.length > 1) {
            String str = new String(ch);
            Text = str;
        }
    }
        public static void main (String[]args){
            Lesson1 mySet = new Lesson1();
            mySet.Set('A');
            System.out.println("Symbol: " + mySet.Symbol);
            mySet.Set("Sssss");
            System.out.println("Text: " + mySet.Text);
            mySet.Set(new char[]{'s', 't', 'r', 'i', 'n', 'g'});
            System.out.println("New Text: " + mySet.Text);
        }
    }