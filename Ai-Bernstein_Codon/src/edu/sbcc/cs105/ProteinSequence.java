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

public class ProteinSequence {

	private int startCodonIndex;
	private int stopCodonIndex;

	/**
	 * sets the start codon index to a specified integer value
	 * 
	 * @param stopIndex
	 */
	public void setStartCodonIndex(int startIndex) {
		this.startCodonIndex = startIndex;
	}

	/**
	 * sets the stop codon index to a specified integer value
	 * 
	 * @param stopIndex
	 */
	public void setStopCodonIndex(int stopIndex) {
		this.stopCodonIndex = stopIndex;
	}

	/**
	 * returns the start codon index of this protein sequence.
	 * 
	 * @return
	 */
	public int getStartCodonIndex() {
		return this.startCodonIndex;
	}

	/**
	 * returns the end codon index of this protein sequence.
	 * 
	 * @return
	 */
	public int getStopCodonIndex() {
		return this.stopCodonIndex;
	}
}
