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

import java.awt.image.*;

import sbccutils.*;

/**
 * @author ajbernstein
 *
 */
public class Sepia implements Filterable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see sbccutils.Filterable#filter(sbccutils.PixelArray)
	 * 
	 */
	@Override

	public PixelArray filter(PixelArray orig) {
		PixelArray pic = new PixelArray(
				new BufferedImage(orig.getWidth(), orig.getHeight(), BufferedImage.TYPE_INT_ARGB));
		for (int i = 0; i < orig.getHeight(); i++) {
			for (int j = 0; j < orig.getWidth(); j++) {
				Pixel p = orig.getPixel(i, j);
				// prereq algorityh parse vonvert to int
				/**
				 * preset values to convert
				 */
				int r = (int) ((p.r * 0.393) + (p.g * 0.769) + (p.b * 0.189) + 0.5);
				int g = (int) ((p.r * 0.349) + (p.g * 0.686) + (p.b * 0.168) + 0.5);
				int b = (int) ((p.r * 0.272) + (p.g * 0.534) + (p.b * 0.131) + 0.5);

				pic.setPixel(i, j, new Pixel(r, g, b));
			}
		}
		return pic;
	}
}
