/**
 * CS 105 Theory and Practice I
 * CRN: [K00714266]
 * Assignment: InstaFilter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */
package edu.sbcc.cs105;

import sbccutils.*;

public class Program {
	/**
	 * activates following classes blur sepia grayscale
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Instafilter instafilter = new Instafilter();

		instafilter.addFilter(new GrayScale());
		instafilter.addFilter(new Blur());
		instafilter.addFilter(new Sepia());
		instafilter.run();

	}

}
