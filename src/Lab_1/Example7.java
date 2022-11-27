package Lab_1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input age: ");
        int age = in.nextInt();

        System.out.printf("Your name is: %s\nYour age is: %d \n", name, age);
        in.close();
    }
}
