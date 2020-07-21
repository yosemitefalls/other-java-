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

/**
 * @author ajbernstein
 *
 */
public class Blur implements Filterable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see sbccutils.Filterable#filter(sbccutils.PixelArray)
	 */
	@Override

	public PixelArray filter(PixelArray orig) {
		// PixelArray pic = new PixelArray(new
		// BufferedImage(pixelArray.getWidth(), pixelArray.getHeight(),
		// BufferedImage.TYPE_INT_ARGB));
		PixelArray output = new PixelArray(orig.getBufferedImage());
		for (int col = 1; col < orig.getWidth() - 1; col++) {
			// creates y axis for each x axis and subseqentky
			for (int row = 1; row < orig.getHeight() - 1; row++) {
				// iterates through surrounding regios
				int sum_r = 0, sum_g = 0, sum_b = 0;
				for (int row_diff = -1; row_diff < 2; row_diff++) {
					for (int col_diff = -1; col_diff < 2; col_diff++) {
						if (!(row_diff == 0 && col_diff == 0)) {
							sum_r += orig.getPixel(row + row_diff, col + col_diff).r;
							sum_g += orig.getPixel(row + row_diff, col + col_diff).g;
							sum_b += orig.getPixel(row + row_diff, col + col_diff).b;
						}
					}
				}
				output.setPixel(row, col, new Pixel(sum_r / 8, sum_g / 8, sum_b / 8));
			}
		}
		return output;
	}

	// tester
	public static void main(String[] args) {
		Instafilter If = new Instafilter();
		If.addFilter(new Blur());
		If.run();
	}
}
