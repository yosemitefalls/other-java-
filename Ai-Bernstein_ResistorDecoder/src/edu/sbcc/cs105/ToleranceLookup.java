/**
 * CS 105 Theory and Practice I
 * CRN: [K00714266]
 * Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */

package edu.sbcc.cs105;

public class ToleranceLookup extends LookupTable {
	/**
	 * Get method for tolerance in array
	 */

	public ToleranceLookup() {

	}

	/**
	 * 
	 * @param color
	 * @return num
	 */
	public String getTolerance(String color) {
		String num = super.get(color, 2);
		return num;
	}

}