package edu.sbcc.cs105;

/**
 * CS 105 Theory and Practice I CRN: [K00714266] Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */

public class NumberLookup extends LookupTable {

	public NumberLookup() {

	}

	/**
	 * 
	 * @param color
	 * @return num
	 */
	public String getDouble(String color) {
		String num = super.get(color, 0);
		return num;
	}

}
