package cse3040;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		int r = generator.nextInt(100) + 1;
		int start = 1;
		int end = 100;
		int count = 1;
		
		while(true)
		{
			System.out.printf("[%d] Guess a number (%d-%d): ", count, start, end);
			int i = in.nextInt();
			if(i == r) {
				System.out.println("Correct!");
				break;
			}
			else if(i > r) {
				System.out.println("Too large!");
				end = i - 1;
				
			}
			else {
				System.out.println("Too small!");
				start = i + 1;
			}
			count++;
					
		}
		
	}

}
