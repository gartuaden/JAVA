/**
 * CSE3040 HW2
 * Level015.java
 * Purpose : Compares two instances of class Points.
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;


/**
 * The class'Points' for evaluating the sum and overriding methods 'toString' and 'equals'.
 * 
 * @param private float sum The sum of floating-point numbers.
 */ 
class Points {
	private float sum = 0;
	
	/**
	 * The constructor of the class.
	 * It evaluates the sum of the array.
	 * 
	 * @return No return.
	 */ 
	public Points(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
	}
	
	/**
	 * The overriding method 'toString()' of the class Object.
	 * 
	 * @return String for the output with the sum.
	 */ 
	@Override
	public String toString() {
		return "[sum of points: " + Float.toString(sum) + "]";
	}
	
	/**
	 * The overriding method 'equals(Object)' of the class Object.
	 * 
	 * @return Boolean result if two floating-point numbers are equal.
	 */ 
	@Override
	public boolean equals(Object otherObject) {
		if(this == otherObject) return true;
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Points other = (Points)otherObject;
		return (this.sum == other.sum);
	}
}

public class Level015 {
	/*
	 * The main method for the Level015 program.
	 * It prints the total area of the shapes.
	 * 
	 * @param Points p1, p2, p3, p4, p5, p6 The given points.
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		Points p1 = new Points(new double[] {1.0, 2.0, 3.0});
		Points p2 = new Points(new double[] {4.0, 5.0, 6.0});
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		Points p3 = new Points(new double[] {1.0, 4.0, 7.0});
		Points p4 = new Points(new double[] {3.0, 9.0});
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p3.equals(p4));
		Points p5 = new Points(new double[] {1.0, 2.0});
		Points p6 = null;
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p5.equals(p6));
	}
}
