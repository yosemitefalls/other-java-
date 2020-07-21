/**
 * CS 105 Theory and Practice I
 * CRN: [K00714266]
 * Assignment: Codon
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Aidan Bernstein]
 */
package edu.sbcc.cs105;

import java.io.*;
import java.util.*;

public class Program {

	public static void main(String[] args) throws IOException {

		ArrayList<CodonSequence> condonSequenceList = new ArrayList<CodonSequence>();
		File inputFile = new File(".\\testSequence.txt");

		for (int i = 0; i < 3; i++) {
			Scanner inputScanner = new Scanner(inputFile);

			// remove the first and second codons for each looping
			for (int n = 1; n <= i; n++) {
				inputScanner.next();
			}

			CodonSequence sequence = new CodonSequence();
			while (inputScanner.hasNext()) {
				sequence.addNucleotide(inputScanner.next());
			}
			condonSequenceList.add(sequence);
			sequence.print();
			if (i < 2) {
				System.out.println("\n******\n");
			}
			inputScanner.close();

		}
	}
}