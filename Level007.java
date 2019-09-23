/**
 * CSE3040 HW1
 * Level007.java
 * Purpose : Print how many instances of the given letter are there in the text.
 * 
 * @version 1.0 9/23/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.Scanner;

public class Level007 {
	
	/*
	 * The main method for the Level007 program.
	 * 
	 * @param Scanner in User input
	 * @param String text User input text
	 * @param String letter User input letter
	 * @param int number Instance
	 * @param int len Length of text
	 * @param String arr Text array
	 * 
	 * @return No return value.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a text : ");
		String text = in.nextLine();
		System.out.print("Enter a letter : ");
		String letter = in.next();
		int number = 0;
		
		String[] arr = text.split("");
		
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			if(letter.equals(arr[i])) number++;
		}
		
		System.out.printf("There are %d %s's in the text.\n", number, letter);

	}

}
