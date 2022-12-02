package Lab_2;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		while ((number % 4 != 0) || (number < 10)) {
			System.out.println("Your number does not right");
			System.out.print("Input number: ");
			number = in.nextInt();
		} 
		System.out.print("Your number is right");
		
		
		in.close();

	}

}
