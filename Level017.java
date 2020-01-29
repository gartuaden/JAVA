/**
 * CSE3040 HW3
 * Level017.java
 * Purpose : Read data from file and print out a summary of data.
 * 
 * @version 1.0 12/11/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Level017 {
	
	/*
	 * The main method for the Level017 program.
	 * It prints a summary of data.
	 * 
	 * @param Map<String, Double> hmap HashMap that stores data which is read from the input file.
	 * @param double maxValue, minValue, price,total Double numbers for the prices of specific items.
	 * @param String maxItem, minItem, buffer Strings for the names of most expansive and the cheapest item.
	 * @param String[] arr String array for reading a line from the text input file.
	 * @param BufferedReader br Variable for reading a line from the text input file.
	 * 
	 * @throws IOException Use try-catch block to catch IOExceptions.
	 * 
	 * @return No return value.
	 */
	
	public static void main(String[] args) {
		
		Map<String, Double> hmap = new HashMap<>();
		double maxValue = 0.0;
		String maxItem = null;
		double minValue = 0.0;
		String minItem = null;
		
		String buffer;
		String[] arr;
		double price;
		double total = 0.0;
	
		try(BufferedReader br = new BufferedReader(new FileReader("./input.txt"))) {
			while((buffer = br.readLine()) != null) {
				arr = buffer.split(" ");
				price = Double.parseDouble(arr[1]);
				hmap.put(arr[0], price);
				total += price;
			}
			
			for(Map.Entry<String, Double> entry : hmap.entrySet()) {
				if(entry.getValue() > maxValue) {
					maxValue = entry.getValue();
					maxItem = entry.getKey();
				}
			}
			
			minValue = maxValue;
			
			for(Map.Entry<String, Double> entry : hmap.entrySet()) {
				if(entry.getValue() < minValue) {
					minValue = entry.getValue();
					minItem = entry.getKey();
				}
			}
			
			System.out.println("Summary");
			System.out.println("-------");
			System.out.println("number of items: " + hmap.size());
			System.out.println("most expensive item: " + maxItem + " (" + maxValue + ")");
			System.out.println("cheapest item: "+ minItem + " (" + minValue + ")");
			System.out.println("average price of items: " + (Double)total/hmap.size());
			br.close();
	
		} catch (IOException e){
			System.out.println("Input file not found!");
		}

	}

}
