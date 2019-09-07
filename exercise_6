package cse3040;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		int lotto[] = new int[6];
		int count, number = 0;
		
		for(int k = 0; k < 6; k++) {
			
			lotto[k] = generator.nextInt(45) + 1;
			for(int j = 0; j < k; j++) {
				if(lotto[k] == lotto[j]) k--;
			}
		
		}
		
		for(count = 0; count < 6; count++)
		{
			System.out.printf("[Lotto] Enter a number #%d (1-45): ", count + 1);
			int i = in.nextInt();
			
			for(int x = 0;  x < 6; x++) {
				if(i == lotto[x]) number++;
			}

		}
		
		System.out.print("This week's lotto numbers: ");
		for(int x = 0; x < 6; x++) System.out.printf("%d ", lotto[x]);
		System.out.print("\n");
		
		System.out.printf("You matched %d numbers.", number);
		
		
	}

}
