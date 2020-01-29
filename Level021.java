/**
 * CSE3040 HW3
 * Level021.java
 * Purpose : Fetch a URL on the Internet and find the information we need.
 * 
 * @version 1.0 12/11/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.net.URL;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level021 {
	
	/*
	 * The main method for the Level021 program.
	 * It fetches a URL on the Internet and get the date, rank, name of the book, writer from the website.
	 * 
	 * @param ArrayList<String> lines String for getting line by line from the source of the Internet.
	 * @param String address Address of the Internet.
	 * @param URL url Url object from the string representation.
	 * @param int rank, status Variables for finding the information
	 * 
	 * @throws IOException Use try-catch block to catch IOExceptions.
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		ArrayList<String> lines = new ArrayList<String>();
		URL url = null;
		BufferedReader input = null;
		String address = "https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&start=we_tab";
		String line = "";
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line=input.readLine()) != null) {
				if(line.trim().length() > 0) lines.add(line);
			}
			input.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < lines.size(); i++) {
			String l = lines.get(i);
			
			if(l.contains("div class=\"newbs_year\"")) {
				int begin = l.indexOf("\">") + "\">".length();
				int end = l.indexOf("<img");
				System.out.print("[" + l.substring(begin,end) + " ");
			}
			if(l.contains("div class=\"newbs_month\"")) {
				int begin = l.indexOf("\">") + "\">".length();
				int end = l.indexOf("<img");
				System.out.print(l.substring(begin,end) + " ");
			}
			if(l.contains("div class=\"newbs_week\"")) {
				int begin = l.indexOf("\">") + "\">".length();
				int end = l.indexOf("<img");
				System.out.println(l.substring(begin,end) + "]");
			}
		}
		int rank = 1;
		int status = 0;

		for(int i = 0; i <lines.size(); i++) {
			String l = lines.get(i);
			
			if(status == 0) {
				if(l.contains("div class=\"ss_book_box\"")) status = 1;
			}
			else if (status == 1) {
				if(l.contains("div class=\"ss_book_list\"")) status = 2;
			} else if (status == 2) {
				if(l.contains("bo3")) {
					int begin = l.indexOf("<b>") + "<b>".length();
					int end = l.indexOf("</b>");
					System.out.print(rank + "위: " + l.substring(begin, end) + " ");

				}
				if(l.contains("지은이") || l.contains("엮은이")) {
					int begin = l.indexOf("\">") + "\">".length();
					int end = l.indexOf("</a>");
					System.out.println("(" + l.substring(begin, end) + ")");
					status = 0;
					rank++;
				}
			}
		}

	}

}
