package Lab_2;

import java.util.Scanner;

public class Lesson6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		System.out.printf("In your number %d thousand", ((number / 1000) % 10));
				
		in.close();

	}

}
