/**
 * 
 */
package com.dsalgo.chapter2.inheritance;

/**
 * @author aariv
 *
 */
public class GeometricProgression extends Progression {

	protected long base;

	/**
	 * 
	 */
	public GeometricProgression() {
		this(2, 1);
	}

	/**
	 * 
	 * @param b
	 */
	public GeometricProgression(long b) {
		this(b, 1);
	}

	/**
	 * 
	 * @param b
	 * @param start
	 */
	public GeometricProgression(long b, long start) {
		super(start);
		base = b;
	}

	/**
	 * Multiplies the current value by the geometric class
	 */
	@Override
	protected void advance() {
		current *= base; // multiply current by geometric class
	}
}
