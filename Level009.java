/**
 * CSE3040 HW1
 * Level009.java
 * Purpose : Print three students with the best exam scores.
 * 
 * @version 1.0 9/23/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.Scanner;

public class Level009 {

	/*
	 * The main method for the Level009 program.
	 * 
	 * @param Scanner in User input
	 * @param int score [] An array of input scores
	 * @param int max Highest score
	 * @param int index Index of an array corresponding to score
	 * 
	 * @return No return value.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score [] = {0, 0, 0, 0, 0};
		
		System.out.println("Please enter exam scores of each student.");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Score of student %d: ", i+1);
			score[i] = in.nextInt();
		}
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 5; i++) {
			if(max < score[i]) {
				max = score[i];
				index = i;
			}
		}
		
		System.out.printf("The 1st place is student %d with %d points.\n", index+1, max);
		score[index] = 0;
		max = 0;
		
		for(int i = 0; i < 5; i++) {
			if(max < score[i]) {
				max = score[i];
				index = i;
			}
		}
		
		System.out.printf("The 2nd place is student %d with %d points.\n", index+1, max);
		score[index] = 0;
		max = 0;
		
		for(int i = 0; i < 5; i++) {
			if(max < score[i]) {
				max = score[i];
				index = i;
			}
		}
		
		System.out.printf("The 3rd place is student %d with %d points.\n", index+1, max);
		
		
	}

}
