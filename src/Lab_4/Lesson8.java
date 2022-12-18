package Lab_4;

/*
Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования», после ввода текста,
появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
Если пользователь вводит что-то другое, отличное от «y» или «n», то программа ему выводит сообщение:
«Введите корректный ответ».
*/

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scan.nextLine();
        System.out.print("Input key: ");
        int key = scan.nextInt();

        String encryptStr = Ceser.encrypt(text, key);
        System.out.print("encrypt text: " + encryptStr);
        System.out.println("Do the reverse conversion? ( y / n )");
        boolean cool = false;
        while (!cool) {
            String reply = scan.next();
            // если пользователь вводит «y», тогда выполнить обратное преобразование.
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Ceser.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                cool = true;
            }
            // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            // Если пользователь вводит что-то другое, отличное от «y» или «n»,
            // то программа ему выводит сообщение: «Введите корректный ответ».
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }

        }
    }
    private static class Ceser {
        static String encryptString;
        private static String encrypt(String Text, int key) {
            char[] ArrayText = Text.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptString = new String(ArrayText);
            return encryptString;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptString = new String(ArrayText);
            return encryptString;
        }
    }
}
