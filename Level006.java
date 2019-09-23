/**
 * CSE3040 HW1
 * Level006.java
 * Purpose : Print how many numbers of user input match the program-selected numbers.
 * 
 * @version 1.1 9/23/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.Random;
import java.util.Scanner;

public class Level006 {
	/*
	 * The main method for the Level006 program.
	 * 
	 * @param int lotto[] An array of random six numbers from 1 to 45.
	 * @param int number Matched number
	 * @param Scanner in User input
	 * @param Random generator Used for random number generating
	 * 
	 * @return No return value.
	 */
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
