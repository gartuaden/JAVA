package cse3040;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a = in.nextDouble();
		System.out.println("Enter second number: ");
		double b = in.nextDouble();
		
		double result = a + b;
		System.out.print("The sum of two numbers is: " + result);

	}

}
