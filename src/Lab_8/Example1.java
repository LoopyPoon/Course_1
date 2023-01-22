package Lab_8;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            File f1=new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Create!!!!");
                System.out.println("Absolut path 1: "+ f1.getAbsolutePath());
            }
            File f2=new File("C:/MyFile2.txt");
            f2.createNewFile();
            System.out.println( "Absolut path 2: "+ f2.getAbsolutePath());
            File f3=new File("C:/Package1/Package2/Package3");
            f3.mkdirs();
            System.out.println("Absolut path 3: "+ f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error!!! "+e);
        }
    }
}
