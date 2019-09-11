/**
 * 
 */
package com.dsalgo.chapter2.inheritance;

/**
 * @author aariv
 *
 */
public class FibonacciProgression extends Progression {

	protected long prev;

	public FibonacciProgression() {
		this(0, 1);
	}

	/**
	 * 
	 * @param first
	 * @param second
	 */
	public FibonacciProgression(long first, long second) {
		super(first);
		prev = second - first;
	}

	@Override
	protected void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}
}
