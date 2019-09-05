/**
 * 
 */
package com.dsalgo.chapter2.inheritance;

/**
 * @author zentere
 *
 */
public class Progression {

	// instance variable
	protected long current;

	/**
	 * Construct prorogression starts with 0 by default
	 */
	public Progression() {
		// this is refering to paramter constructer which is down
		this(0);
	}

	/**
	 * Constructs the progression with start value
	 * 
	 * @param start
	 */
	public Progression(long start) {
		current = start;
	}

	/**
	 * Returns the next value of the progression
	 * 
	 * @return
	 */
	public long nextValue() {
		long answer = current;
		// this method will calculate the value in advance and keep it ready for the next iternation
		advance(); // this protected call is responsible for advancing the current value
		return answer;
	}

	/**
	 * Advances the current value to the next value of the progression
	 */
	protected void advance() {
		current = current + 1;
	}

	/**
	 * Prints the next n values of the progression, seperated by space
	 */
	public void printProgression(int n) {
		System.out.print(nextValue()); // print first value without leading space
		for (int j = 1; j < n; j++)
			System.out.print(" " + nextValue()); // print leading space before others
		System.out.println(); // end with new line
	}
}
