package Lab_1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input surname: ");
        String surname = in.nextLine();

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input middle name: ");
        String middle_name = in.nextLine();

        System.out.printf("Hello %s %s %s \n", surname, name, middle_name);
        in.close();
    }
}
