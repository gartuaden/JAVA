package cse3040;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("ASCII code teller. Enter a letter: ");
		String c = in.nextLine();
		
		char letter = c.charAt(0);
		
		System.out.printf("The ASCII code of %c is %d.", letter, (int)letter);
			
	}

}
