/**
 * CSE3040 HW2
 * Level013.java
 * Purpose : Calculates the sum of area of multiple shapes.
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;
import java.lang.Math;

/**
 * The superclass 'Shape' for calculating the sum of the entire results.
 * 
 * @param private double result The result of calculation of area.
 * @param private static double sum The total sum of the results.
 */ 
class Shape {
	
	private double result;
	private static double sum = 0;
	
	/**
	 * The constructor of the class.
	 * It gets the number and total sum of results.
	 * 
	 * @return No return.
	 */ 
	public Shape(double number) {
		this.result = number;
		sum += this.result;
	}
	
	/**
	 * Returns the total sum of area of multiple shapes.
	 * 
	 * @return The total sum of results.
	 */ 
	public static double sum(Shape[] arr) {
		return sum;
	}
}

/**
 * The subclass 'Circle' that inherits all members of superclass 'Shape'.
 * 
 * @param args Not used
 */ 
class Circle extends Shape {
	/**
	 * The constructor of the class 'Circle'.
	 * Evaluate the area of circle (pi*r^2) and explicitly call the superclass constructor.
	 * 
	 * @return No return.
	 */ 
	public Circle(double number) {
		super(number * number * Math.PI);
	}
}

/**
 * The subclass 'Square' that inherits all members of superclass 'Shape'.
 * 
 * @param args Not used
 */ 
class Square extends Shape {
	/**
	 * The constructor of the class 'Square'.
	 * Evaluate the area of square and explicitly call the superclass constructor.
	 * 
	 * @return No return.
	 */ 
	public Square(double number) {
		super(number * number);
	}	
}

/**
 * The subclass 'Rectangle' that inherits all members of superclass 'Shape'.
 * 
 * @param args Not used
 */ 
class Rectangle extends Shape {
	/**
	 * The constructor of the class 'Rectangle'.
	 * Evaluate the area of rectangle and explicitly call the superclass constructor.
	 * 
	 * @return No return.
	 */ 
	public Rectangle(double numberA, double numberB) {
		super(numberA * numberB);
	}
}

public class Level013 {
	/*
	 * The main method for the Level013 program.
	 * It prints the total area of the shapes.
	 * 
	 * @param Shape[] arr The Shape array that has the area of that current.
	 * 
	 * @return No return value.
	 */
	public static void main(String args[]) {
		Shape[] arr = {new Circle(5.0), new Square(4.0), new Rectangle(3.0, 4.0), new Square(5.0)};
		System.out.println("Total area of the shapes is: " + sumArea(arr));
	}
	
	/*
	 * The private static method sumArea
	 * It returns the sum of the given array.
	 * 
	 * @return Returns the total sum from the method 'sum' of the class 'Shape'.
	 */
	private static double sumArea(Shape[] arr) {
		return Shape.sum(arr);
	}
}
