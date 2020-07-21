package edu.sbcc.cs105;

/**
 * CS 105 Theory and Practice I CRN: [K00714266] Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */

// loop up table class
public class MultiplierLookup extends LookupTable {

	public MultiplierLookup() {

	}

	/**
	 * 
	 * @param color
	 * @returndoubloe mult which effeictlevely draws from super,get function
	 */
	public double getDouble(String color) {
		String num = super.get(color, 1);
		double mult = Double.parseDouble(num);
		return mult;
	}

}