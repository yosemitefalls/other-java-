package edu.sbcc.cs105;

/**
 * CS 105 Theory and Practice I CRN: [K00714266] Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */

public class ResistorDecoder {

	String[] colors = new String[4];
	public String band1;
	public String band2;
	public String band3;
	public String band4;

	public ResistorDecoder() {

	}

	/**
	 * the beef of the code right here, deciphers calls methods in order to
	 * determine streams color etc
	 * 
	 * @param resistorColor
	 * @return
	 */
	public String decodeResistor(String[] resistorColor) {
		colors = resistorColor;

		band1 = colors[0];
		band2 = colors[1];
		band3 = colors[2];
		band4 = colors[3];
		NumberLookup n = new NumberLookup();
		NumberLookup o = new NumberLookup();
		ToleranceLookup p = new ToleranceLookup();
		MultiplierLookup m = new MultiplierLookup();
		double bothNums = Double.parseDouble(n.getDouble(band1) + o.getDouble(band2));
		double multiplier = (m.getDouble(band3));
		bothNums *= multiplier;
		String resistance = "";

		String bothNumsStr = bothNums + "";

		System.out.println(bothNums + " " + bothNumsStr);

		if (0.0 < bothNums && bothNums < 1000.0) {
			System.out.println("in first");
			if (bothNums % 1 == 0) { // if bothNums is an integer
				bothNumsStr = ((int) bothNums) + "";
				resistance = bothNumsStr + "Ω, ";
			} else
				resistance = bothNums + "Ω, ";
			System.out.println(bothNums + " " + bothNumsStr + " " + resistance);
		} else if (1000.0 <= bothNums && bothNums < 1000000.0) {
			System.out.println("in second");
			bothNums /= 1000;
			if (bothNums % 1 == 0) { // if bothNums is an integer
				bothNumsStr = ((int) bothNums) + "";
				resistance = bothNumsStr + "KΩ, ";
			} else
				resistance = bothNums + "KΩ, ";
			System.out.println(bothNums + " " + bothNumsStr + " " + resistance);
		} else if (bothNums >= 1000000.0) {
			System.out.println("in third");
			bothNums /= 1000000;
			if (bothNums % 1 == 0) { // if bothNums is an integer
				bothNumsStr = ((int) bothNums) + "";
				resistance = bothNumsStr + "MΩ, ";
			} else
				resistance = bothNums + "MΩ, ";
			System.out.println(bothNums + " " + bothNumsStr + " " + resistance);
		}
		String tolerance = p.getTolerance(band4);

		// double toleranceDouble = Double.parseDouble(tolerance);
		// if (toleranceDouble % 1 == 0) {
		// toleranceDouble = (int) toleranceDouble;
		// resistance = toleranceDouble + "";
		// }
		String output = resistance + tolerance;
		return output;
	}

}