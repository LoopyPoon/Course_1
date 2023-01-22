package Lab_8;

/*
Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.
 */

import java.io.*;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first file name: ");
        String fileName = scan.nextLine();
        System.out.print("Input second file name: ");
        String file2Name = scan.nextLine();
        int n = 2;
        System.out.println("Count of string to write: " + n);
        double[] array = new double[5];

            try {
                File file1 = new File("C:/tmp/" + fileName + ".txt");
                System.out.println("First file created!\n" +
                        "First file path: " + file1.getAbsolutePath());

                File file2 = new File("C:/tmp/" + file2Name + ".txt");
                System.out.println("Second file created!\n" +
                        "Second file path: " + file2.getAbsolutePath());

                DataOutputStream dOut = new DataOutputStream(new FileOutputStream(file1));
                for (int i = 0; i < n; i++) {
                    System.out.println("Input a string to write into file: ");
                    String str = scan.nextLine();
                    dOut.writeUTF(str + "\n");
                }
                System.out.println("Input 5 numbers: ");
                for (double i : array) {
                    double num = scan.nextDouble();
                    dOut.writeUTF(num + " ");
                }
                dOut.flush();
                dOut.close();

                Reader in = new FileReader(file1);
                Writer out = new FileWriter(file2, true);

                int oneByte;
                while ((oneByte = in.read()) != -1) {
                    out.write((char) oneByte);
                    System.out.print((char) oneByte);
                }

                DataInputStream dInp = new DataInputStream(new FileInputStream(file1));
                dOut = new DataOutputStream(new FileOutputStream(file2));
                while (true) {
                    String s = dInp.readUTF();
                    dOut.writeUTF(s);
                    Double num = dInp.readDouble();
                    dOut.writeDouble(num);
                    System.out.println(dInp.readUTF());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
    }
}
