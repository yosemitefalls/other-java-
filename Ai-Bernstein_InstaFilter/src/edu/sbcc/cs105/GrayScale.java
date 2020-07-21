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
 * creates pixel array sets each pixel equal to gray
 *
 */
public class GrayScale implements Filterable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see sbccutils.Filterable#filter(sbccutils.PixelArray)
	 */

	public PixelArray filter(PixelArray pixelArray) {
		PixelArray pic = new PixelArray(
				new BufferedImage(pixelArray.getWidth(), pixelArray.getHeight(), BufferedImage.TYPE_INT_ARGB));
		for (int i = 0; i < pixelArray.getHeight(); i++) {
			for (int j = 0; j < pixelArray.getWidth(); j++) {
				Pixel p = pixelArray.getPixel(i, j);
				int gray = (p.r + p.g + p.b) / 3;

				pic.setPixel(i, j, new Pixel(gray, gray, gray));
			}
		}
		return pic;
	}
}
