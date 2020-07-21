package edu.sbcc.cs105;

/**
 * CS 105 Theory and Practice I CRN: [K00714266] Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResistorDecoder r = new ResistorDecoder();

		// String[] resistor0 = { "Black", "Brown", "Black", "Gold" };
		String[] resistor0 = { "Brown", "Black", "Red", "Gray" };
		System.out.println("Expected output: 1Ω, ±5% Actual output: " + r.decodeResistor(resistor0));
	}

}
