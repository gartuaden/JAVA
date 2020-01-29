/**
 * CSE3040 HW3
 * Level022.java
 * Purpose : Fetch a URL on the Internet and find the information we need by using jsoup library.
 * 
 * @version 1.0 12/11/2019
 * @author Jung Won Lee
 */

package cse3040;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Level022 {
	
	/*
	 * The main method for the Level022 program.
	 * It fetches a URL on the Internet and get the date, rank, name of the book, writer from the website.
	 * 
	 * @param URL url Url object from the string representation.
	 * @param Document doc Document for connecting to a URL using Jsoup.connect method.
	 * @param Elements year, month, week, bestsellers,titles, booktitles, writers Extracted data from the HTML file.
	 * 
	 * @throws IOException Use try-catch block to catch IOExceptions.
	 * 
	 * @return No return value.
	 */
	public static void main(String[] args) {
		String url = "https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&start=we_tab";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		Elements year = doc.select("div.newbs_year");
		Elements month = doc.select("div.newbs_month");
		Elements week = doc.select("div.newbs_week");
		
		System.out.println("[" + year.eq(0).text() + " " + month.eq(0).text() +" " + week.eq(0).text() +"]");
		
		Elements bestsellers = doc.select("div.ss_book_box");
		Elements titles = bestsellers.select("div.ss_book_list");
		Elements booktitles = titles.select("a[href].bo3");
		Elements writers = titles.select("a[href^=/Search/wSearchResult.aspx?AuthorSearch=]:first-child");
		
		for(int i = 0; i < booktitles.size(); i++) {
			System.out.print(i + 1 + "À§: " + booktitles.eq(i).text() + " ");
			System.out.println("(" + writers.eq(i).text() + ")");
		}

	}

}
