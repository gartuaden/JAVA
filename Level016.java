/**
 * CSE3040 HW2
 * Level016.java
 * Purpose : Read text from a file and counts number of occurrences for each character.
 * 
 * @version 1.0 11/5/2019
 * @author Jung Won Lee
 */

package cse3040;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * The class 'Text' for reading buffer from the given file name and count the character in the text.
 * 
 * @param private int count The number of occurrences for each character.
 * @param pravate String buffer The text from the given file.
 */ 
class Text {
	private int count;
	private String buffer = "";
	
	/**
	 * Checks if the file exists and reads characters from the file.
	 * 
	 * @throws IOException Use try-catch block to catch IOExceptions.
	 * @return No return.
	 */ 
	public void readTextFromFile(String str) {
		try(BufferedReader br = new BufferedReader(new FileReader(str))) {
			while(true) {
				String line = br.readLine();
				this.buffer += line;
				if(line == null) break;
			}
		} catch (IOException e){
			System.out.println("Error: file does not exist.");
		}
	}
	
	/**
	 * Counts number of occurrences for each character and returns it.
	 * 
	 * @return Number of occurrences.
	 */ 
	public int countChar(char alphabet) {
		this.count = 0;
		for(int i = 0; i < buffer.length(); i++) {
			if(buffer.charAt(i) == alphabet) this.count++;
		}
		return this.count;
	}
}

public class Level016 {
	
	/*
	 * The main method for the Level016 program.
	 * It prints the total area of the shapes.
	 * 
	 * 
	 * @return No return value.
	 */
	public static void main(String args[]) {
		Text t = new Text();
		t.readTextFromFile("src/cse3040/exercises/input_Level016.txt");
		System.out.println("a: " + t.countChar('a'));
		System.out.println("b: " + t.countChar('b'));
		System.out.println("c: " + t.countChar('c'));
	}
}
