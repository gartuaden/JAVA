/**
 * CSE3040 HW2
 * Level011.java
 * Purpose : Print the Fibonacci sequence.
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;

/**
 * The interface that includes a group of methods 'hasNext()' and 'next()'.
 */ 

interface IntSequence {
	/**
	 * The 'hasNext' default method for the interface IntSequence.
	 * Checks if the next element exists or not.
	 * 
	 * @return boolean true.
	 */ 
	default boolean hasNext() {
		return true;
	}
	
	/**
	 * The 'next' method for the interface IntSequence.
	 * It doesn't have actual implementations 
	 */ 
	int next();
}

/**
 * The class 'FibonacciSequence' that implements the interface 'IntSequence'.
 * It specifies abstract methods from the interface.
 * 
 * @param private int result An element of the Fibonacci sequence.
 * @param pravate int a, b, temp Integers for making the fibonacci numbers.
 */ 

class FibonacciSequence implements IntSequence {
	
	private int result;
	private int a = 0, b = 1, temp = 0;

	/**
	 * Make a fibonacci number and save into the integers.
	 * 
	 * @return The integer element of the Fibonacci sequence 'result'. 
	 */ 
	public int next() {
		result = a;
		temp = a + b;
		a = b;
		b = temp;
		return result;
	}

}


public class Level011 {
	/*
	 * The main method for the Level011 program.
	 * It prints Fibonacci sequence f(0) to f(20)
	 * 
	 * @param IntSequence seq Interface for Fibonacci sequence
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSequence seq = new FibonacciSequence();
		for(int i=0; i<20; i++) {
			if(seq.hasNext() == false) break;
				System.out.print(seq.next() + " ");
		}
		System.out.println(" ");	
	}
}
