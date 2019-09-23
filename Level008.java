/**
 * CSE3040 HW1
 * Level008.java
 * Purpose : Print how many instances of the given string are there in the text.
 * 
 * @version 1.0 9/23/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.Scanner;

public class Level008 {
	/*
	 * The main method for the Level008 program.
	 * 
	 * @param Scanner in User input
	 * @param String text User input text
	 * @param String str User input string
	 * @param int number Instance
	 * @param int start Starting point of indexOf method
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a text : ");
		String text = in.nextLine();
		System.out.print("Enter a string : ");
		String str = in.next();
		int number = 0;
		int start = 0;

		while(text.indexOf(str, start) != -1) {
			start = text.indexOf(str, start) + 1;
			number++;
		}

		System.out.printf("I have found %d instances of \"%s\".\n", number, str);
		
	}

}
