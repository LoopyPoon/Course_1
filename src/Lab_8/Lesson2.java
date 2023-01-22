package Lab_8;

import java.io.*;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first file name: ");
        String fileName = scan.nextLine();
        System.out.print("Input second file name: ");
        String file2Name = scan.nextLine();
        int n = 2;
        System.out.println("Count of string to write: " + n);
        double[] array = new double[5];

        BufferedReader br = null;
        PrintWriter out = null;

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

            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/tmp/" + fileName + ".txt"),"cp1251"));
            out = new PrintWriter("C:/tmp/" + file2Name + ".txt","cp1251");

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
