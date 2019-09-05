/**
 * 
 */
package com.dsalgo.chapter2.inheritance;

/**
 * @author zentere
 *
 */
public class ArithmaticProgression extends Progression {

	protected long increment;

	/**
	 * 
	 */
	public ArithmaticProgression() {
		// this refers the third constructor with param1
		this(1, 0);
	}

	/**
	 * 
	 * @param stepSize
	 */
	public ArithmaticProgression(long stepSize) {
		// this refers the third constructor with param2
		this(stepSize, 0);
	}

	/**
	 * 
	 * @param stepSize
	 * @param start
	 */
	public ArithmaticProgression(long stepSize, long start) {
		// this referss progression class constructor.
		super(start);
		increment = stepSize;
	}

	/**
	 * adds arithmatic increment to the current value
	 */
	protected void advance() {
		current += increment;
	}
}
