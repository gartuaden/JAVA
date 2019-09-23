/**
 * CSE3040 HW1
 * Level005.java
 * Purpose : Print whether the user input is correct or not about random number between 1 and 100.
 * 
 * @version 1.1 9/23/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.Scanner;
import java.util.Random;


public class Level005 {
	/*
	 * The main method for the Level005 program.
	 * 
	 * @param int r Generated random number from 1 to 100
	 * @param Scanner in User input
	 * @param Random generator Used for random number generating 
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		int r = generator.nextInt(100) + 1;	
		while(true)
		{
			System.out.print("Guess a number (1-100): ");
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
