/**
 * CSE3040 HW3
 * Level018.java
 * Purpose : Read data from file and print out the data in a sorted order.
 * 
 * @version 1.0 12/11/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The class 'Element' for getting the item and the price from the input file and make it in right format for printing.
 * It implements interface Comparable<Element> and overrides compareTo(Element elem).
 * 
 * @param private String item Given name of the item from the text input file.
 * @param pravate double price Given price of the item from the text input file.
 */ 

class Element implements Comparable<Element> {
	private String item;
	private double price;
	
	/**
	 * The constructor of the class.
	 * It stores name and price of an item.
	 * 
	 * @return No return.
	 */ 
	public Element (String item, double price) {
		this.item = item;
		this.price = price;
	}
	
	/**
	 * Make the string of the name and the price in the right format.
	 * 
	 * @return String for the result in the right format.
	 */ 
	public String getStr() {
		String str = this.item.concat(" ");
		return str.concat(Double.toString(this.price));
	}
	
	/**
	 * The overriding method 'compareTo' of the interface Comparable.
	 * If the given price is smaller than the current price, it returns 1. Otherwise, return -1.
	 * Especially, if the prices are the same, compare the name and sort it in the alphabetical order by calling compareTo().
	 * 
	 * @return Integer result according to the if-else statement.
	 */
	@Override
	public int compareTo(Element elem) {
		if(this.price > elem.price) {
			return 1;
		} else if (this.price == elem.price) {
			int compare = this.item.compareTo(elem.item);
			if(compare > 0) return 1;
		}
		return -1;
	}
	
	/**
	 * The overriding method 'toString()' of the class Object.
	 * 
	 * @return String for the output in the right format.
	 */
	@Override
	public String toString() {
		return getStr();
	}

}


public class Level018 {
	
	/*
	 * The private static method readDataFromFile.
	 * It reads data from the text input file and store the data in the data structure.
	 * 
	 * @param Map<String,Double> hmap HashMap that stores data which is read from the input file.
	 * @param String buffer Strings for reading a line from the text input file.
	 * @param String[] arr String array for reading a line from the text input file.
	 * @param double price Double number for the price of specific items.
	 * @param BufferedReader br Variable for reading a line from the text input file.
	 * 
	 * @throws IOException Use try-catch block to catch IOExceptions.
	 * 
	 * @return Returns 1 if the given file doesn't exist, otherwise return 0.
	 */
	private static int readDataFromFile(String string, ArrayList<Element> list) {
		Map<String, Double> hmap = new HashMap<>();
		String buffer;
		String[] arr;
		double price;
		try(BufferedReader br = new BufferedReader(new FileReader(string))) {
			
			while((buffer = br.readLine()) != null) {
				arr = buffer.split(" ");
				price = Double.parseDouble(arr[1]);
				hmap.put(arr[0], price);
			}
			
			for(Map.Entry<String, Double> entry : hmap.entrySet()) {
				list.add(new Element(entry.getKey(), entry.getValue()));
			}
			
		} catch (IOException e){
			return 1;
		}

		return 0;
	}
	
	/*
	 * The main method for the Level018 program.
	 * It prints out the data in the sorted order.
	 * 
	 * @param ArryaList<Element> list ArrayList for storing the data from the text input file.
	 * @param int rv The flag that checks if the given input file exists.
	 * @param Iterator<Element> it Iterator for printing out the ArrayList.
	 * 
	 * @throws Exception for reading a file.
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Element> list = new ArrayList<>();
		int rv = readDataFromFile("./input.txt", list);
		if(rv == 1) {
			System.out.println("input file not found!");
			return;
		}
		Collections.sort(list);
		Iterator<Element> it = list.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}


}
