package Lab_8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input file name: ");
        String fname = sc.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Absolut file path: " + f1.getAbsolutePath());
            System.out.print("Input string count to write into file: ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Input string to write into file: ");
                String s = sc.nextLine();
                dOut.writeUTF(s + "\n");
            }
            dOut.flush();
            dOut.close();

            DataInputStream dLn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dLn.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
