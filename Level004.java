/**
 * CSE3040 HW1
 * Level004.java
 * Purpose : Write a Java program that asks user for an alphabet, and prints the ASCII code of the alphabet.
 * 
 * @version 1.1 9/23/2019
 * @author Jung Won Lee
 */


package cse3040;

import java.util.Scanner;

public class Level004 {
	/*
	 * The main method for the Level004 program.
	 * 
	 * @param char letter First letter of the string input
	 * @param Scanner in User input
	 * @param String c User input
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("ASCII code teller. Enter a letter: ");
		String c = in.nextLine();
		
		char letter = c.charAt(0);
		
		System.out.printf("The ASCII code of %c is %d.", letter, (int)letter);
	}

}
