/**
 * CSE3040 HW2
 * Level014.java
 * Purpose : Calculates distance between two points in N-dimensional space.
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;
import java.lang.Math;

/**
 * The superclass 'Point' for getting double array of given points.
 * 
 * @param private double[] arr Given double array
 */ 

class Point {
	private double[] arr;
	
	/**
	 * The constructor of the class.
	 * It gets the given double array.
	 * 
	 * @return No return.
	 */ 
	public Point(double[] arr) {
		this.arr = arr;
	}
	
	/**
	 * Returns the given double array.
	 * 
	 * @return The given double array.
	 */ 
	public double[] getArr() {
		return this.arr;
	}
}

/**
 * The subclass 'EuclideanDistance' that inherits all members of superclass 'Point'.
 * 
 * @param private static double sum The sum of the power of points.
 * @param private static double[] arr1, arr2 The given points.
 */ 
class EuclideanDistance extends Point {
	private static double sum = 0.0;
	private static double[] arr1, arr2;
	
	/**
	 * The constructor of the class 'EuclideanDistance'.
	 * Gets the double array and explicitly call the superclass constructor.
	 * 
	 * @return No return.
	 */ 
	public EuclideanDistance(double[] arr) {
		super(arr);
	}
	
	/**
	 * Evaluates Euclidean distance between N-dimensional points.
	 * 
	 * @return Result of the evaluation.
	 */ 
	public static double getDist(Point p1, Point p2) {
		arr1 = p1.getArr();
		arr2 = p2.getArr();
		if(arr1.length != arr2.length) return -1.0;
		for(int i = 0; i < arr1.length; i++) {
			sum += Math.pow((arr1[i] - arr2[i]), 2.0);
		}
		return Math.sqrt(sum);

	}
}

/**
 * The subclass 'ManhattanDistance' that inherits all members of superclass 'Point'.
 * 
 * @param private static double distance The result of the evaluation.
 * @param private static double[] arr1, arr2 The given points.
 */ 
class ManhattanDistance extends Point {
	private static double distance = 0.0;
	private static double[] arr1, arr2;
	
	/**
	 * The constructor of the class 'ManhattanDistance'.
	 * Gets the double array and explicitly call the superclass constructor.
	 * 
	 * @return No return.
	 */ 
	public ManhattanDistance (double[] arr) {
		super(arr);
	}
	
	/**
	 * Evaluates Manhattan distance between N-dimensional points.
	 * 
	 * @return Result of the evaluation.
	 */ 
	public static double getDist(Point p1, Point p2) {
		arr1 = p1.getArr();
		arr2 = p2.getArr();
		if(arr1.length != arr2.length) return -1.0;
		
		for(int i = 0;i < arr1.length; i++) {
			distance += Math.abs(arr1[i] - arr2[i]);
		}
		return distance;
	}
}

public class Level014 {
	/*
	 * The main method for the Level014 program.
	 * It prints the total area of the shapes.
	 * 
	 * @param Point p1, p2, p3, p4 The given points.
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		Point p1 = new Point(new double[] {1.0, 2.0, 3.0});
		Point p2 = new Point(new double[] {4.0, 5.0, 6.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p1, p2));
		System.out.println("Manhattan Distance: " + ManhattanDistance.getDist(p1, p2));
		Point p3 = new Point(new double[] {1.0, 2.0, 3.0});
		Point p4 = new Point(new double[] {4.0, 5.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p3, p4));
		System.out.println("Manhattan Distance: " + ManhattanDistance.getDist(p3, p4));
	}
}
