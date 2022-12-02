package Lab_2;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		if (number % 3 == 0) {
			System.out.print("Your number is divisible by 3");
		} else {
			System.out.print("Your number is not divisible by 3");
		}
		
		in.close();
		
	}

}
