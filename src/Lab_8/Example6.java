package Lab_8;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:/tmp/MyFile1.txt");
            out = new FileWriter("C:/tmp/MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
