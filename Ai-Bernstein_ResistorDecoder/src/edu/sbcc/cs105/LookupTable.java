package edu.sbcc.cs105;
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

/**
 * 
 * 
 * 
 * creates look up class and puts them in ArrayList for call
 */

import java.util.*;

public abstract class LookupTable {

	public ArrayList<String> bandStats = new ArrayList<String>(3);

	/**
	 * upon case determination appends values through band stats
	 * 
	 * @param color
	 * @param index
	 * @return a whole lot
	 */
	public String get(String color, int index) {
		switch (color) {

		case "Black":
			bandStats.add("0");
			bandStats.add("1");
			bandStats.add("");
			break;
		case "Brown":
			bandStats.add("1");
			bandStats.add("10");
			bandStats.add("±1%");
			break;
		case "Red":
			bandStats.add("2");
			bandStats.add("100");
			bandStats.add("±2%");
			break;
		case "Orange":
			bandStats.add("3");
			bandStats.add("1000");
			bandStats.add("");
			break;
		case "Yellow":
			bandStats.add("4");
			bandStats.add("10000");
			bandStats.add("±5%");
			break;
		case "Green":
			bandStats.add("5");
			bandStats.add("100000");
			bandStats.add("±0.5%");
			break;
		case "Blue":
			bandStats.add("6");
			bandStats.add("1000000");
			bandStats.add("±0.25%");
			break;
		case "Violet":
			bandStats.add("7");
			bandStats.add("10000000");
			bandStats.add("±0.1%");
			break;
		case "Gray":
			bandStats.add("8");
			bandStats.add("100000000");
			bandStats.add("±10%");
			break;
		case "White":
			bandStats.add("9");
			bandStats.add("1000000000");
			bandStats.add("");
			break;
		case "Gold":
			bandStats.add("");
			bandStats.add("0.1");
			bandStats.add("±5%");
			break;
		case "Silver":
			bandStats.add("");
			bandStats.add("0.01");
			bandStats.add("±10%");
			break;
		default:
			bandStats.add("");
			bandStats.add("");
			bandStats.add("±20%");

		}

		return bandStats.get(index);
	}

}
