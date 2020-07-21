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

import java.util.*;

public class CodonSequence extends ProteinSequence {

	private ArrayList<String> sequence = new ArrayList<String>();
	private ArrayList<ProteinSequence> proteinSequences = new ArrayList<ProteinSequence>();
	private String codon = "";

	public CodonSequence() {

	}

	/**
	 * adds nucleotide to the codon sequence
	 * 
	 * @param nucleotide
	 */
	public void addNucleotide(String nucleotide) {
		// checks to make sure a proper character for a nucleotide was inputed
		if (nucleotide.equalsIgnoreCase("u") || nucleotide.equalsIgnoreCase("a") || nucleotide.equalsIgnoreCase("c")
				|| nucleotide.equalsIgnoreCase("g") || nucleotide.equalsIgnoreCase("t")) {

			this.codon = this.codon + nucleotide;

			if (codon.length() == 3) {
				sequence.add(this.codon);
				this.codon = "";

			}
		}
	}

	/**
	 * returns all protein sequences present or number of protein sequences
	 * found.
	 * 
	 * @return length effective
	 */
	public int findAllProteinSequences() {
		int startIndexNumber = 0;
		int stopIndexNumber = 0;

		// this for loop checks each codon in the sequence list for matches with
		// start codons and stop codons

		boolean beginning_found = false;

		for (int i = 0; i < sequence.size(); ++i) {

			if (beginning_found == false) {
				// System.out.println("i no begin: " + i);
				if (sequence.get(i).equalsIgnoreCase("AUG") || sequence.get(i).equalsIgnoreCase("GUG")
						|| sequence.get(i).equalsIgnoreCase("UUG")) {

					beginning_found = true;

					startIndexNumber = i;
				}
			} else {
				// System.out.println("i begin: " + i);
				if (sequence.get(i).equalsIgnoreCase("UAA") || sequence.get(i).equalsIgnoreCase("UAG")
						|| sequence.get(i).equalsIgnoreCase("UGA")) {

					beginning_found = false;
					stopIndexNumber = i;
					ProteinSequence currentSequence = new ProteinSequence();
					currentSequence.setStartCodonIndex(startIndexNumber);
					currentSequence.setStopCodonIndex(stopIndexNumber);
					proteinSequences.add(currentSequence);

				}

			}

		}

		return proteinSequences.size();

	}

	/**
	 * extracts a protein sequences at a given index and returns the
	 * ProteinSequence object. If the given index is out of bounds, null is
	 * returned.
	 * 
	 * @param whichSequence
	 * @return
	 */
	public ProteinSequence getProteinSequence(int whichSequence) {
		if (this.proteinSequences.get(whichSequence) != null) {
			return this.proteinSequences.get(whichSequence);
		} else {
			return null;
		}
	}

	/**
	 * prints all information in a format specified by problem discription
	 */
	public void print() {

		int number_of_protein_seq = this.findAllProteinSequences();

		System.out.printf("Number of Sequences: %d\n", number_of_protein_seq);

		for (int i = 0; i < number_of_protein_seq; ++i) {
			System.out.println("Sequence: " + number_of_protein_seq);
			System.out.println("Start: " + this.getProteinSequence(i).getStartCodonIndex());
			System.out.println("Stop: " + this.getProteinSequence(i).getStopCodonIndex());
		}

		for (String i : sequence) {
			System.out.println(i);
		}

	}

	// setters and getters

	/**
	 * returns a sequence of codons ArrayList
	 * 
	 * @return
	 */
	public ArrayList<String> getSequence() {
		return sequence;
	}

	/**
	 * returns the sequence of full codons read in
	 * 
	 * @param sequence
	 */
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	/**
	 * returns a Array List of protein Sequence objects.
	 * 
	 * @return
	 */
	public ArrayList<ProteinSequence> getProteinSequences() {
		return proteinSequences;
	}

	/**
	 * sets the array list of Protein sequence to a specified list
	 * 
	 * @param proteinSequences
	 */
	public void setProteinSequences(ArrayList<ProteinSequence> proteinSequences) {
		this.proteinSequences = proteinSequences;
	}

	/**
	 * gets the current codon. most likely remaining codon parts from the file
	 * 
	 * @return
	 */
	public String getCodon() {
		return codon;
	}

	/**
	 * sets the current codon to a specified string
	 * 
	 * @param codon
	 */
	public void setCodon(String codon) {
		this.codon = codon;
	}

}
