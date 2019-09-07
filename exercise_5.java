package cse3040;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		int r = generator.nextInt(100) + 1;	
		while(true)
		{
			System.out.println("Guess a number (1-100): ");
			int i = in.nextInt();
			if(i == r) {
				System.out.println("Correct!");
				break;
			}
			else if(i > r) {
				System.out.println("Too large!");
			}
			else {
				System.out.println("Too small!");
			}
					
		}
		
	}

}
