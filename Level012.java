/**
 * CSE3040 HW2
 * Level012.java
 * Purpose : Take an integer from user and print the integer in binary number format. 
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;
import java.util.Scanner;
import java.lang.Math;

/**
 * The interface that includes a group of methods 'hasNext()' and 'next()'.
 */ 
interface IntSequenceStr {
	/**
	 * The 'hasNext' method for the interface IntSequence.
	 * It doesn't have actual implementations 
	 */ 
	boolean hasNext();
	
	/**
	 * The 'next' method for the interface IntSequence.
	 * It doesn't have actual implementations 
	 */ 
	int next();
}

/**
 * The class 'BinarySequence' that implements the interface 'IntSequenceStr'.
 * It specifies abstract methods from the interface.
 * 
 * @param private int number Given positive integer user input.
 * @param private int copy The copy of the number.
 * @param private int exponent The max exponent (2) of the given number.
 * @param private int binary The current binary number.
 */ 
class BinarySequenceStr implements IntSequenceStr {
	
	private int number, copy;
	private int exponent, binary;
	
	/**
	 * The constructor of the class.
	 * It gets the number and exponent.
	 * 
	 * @return No return.
	 */ 
	public BinarySequenceStr (int n) {
		number = n;
		copy = n;
		while(true) {
			copy /= 2;
			if(copy == 0) break;
			exponent++;
		}
		
	}
	
	/**
	 * Checks if it has the next exponent.
	 * 
	 * @return boolean Whether it has the next exponent.
	 */ 
	public boolean hasNext() {
		return exponent + 1 != 0;
	}
	
	/**
	 * Evaluate the current context in binary format and return it.
	 * 
	 * @return The current context in binary format.
	 */ 
	public int next() {
		binary = number / (int)Math.pow(2, exponent);
		exponent--;
		return binary % 2;
	}

}

public class Level012 {
	/*
	 * The main method for the Level012 program.
	 * It gets the user input and prints it in binary format.
	 * 
	 * @param IntSequence seq Interface for BinarySequenceStr
	 * @param Scanner in, String str User string input
	 * 
	 * @return No return value.
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String str = in.nextLine();
		int num = Integer.parseInt(str);
		in.close();
		System.out.println("Integer: " + num);
		IntSequenceStr seq = new BinarySequenceStr(num);
		System.out.print("Binary number: ");
		while(seq.hasNext()) System.out.print(seq.next());
		System.out.println("");
	}
}
