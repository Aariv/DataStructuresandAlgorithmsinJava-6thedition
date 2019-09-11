/**
 * 
 */
package com.dsalgo.chapter2.minheritance;

/**
 * @author aariv
 *
 */
public interface Transportable {

	/**
	 * Returns the weight in grams.
	 * 
	 * @return
	 */
	public int weight();

	/**
	 * Returns whether the object is hazardous
	 * 
	 * @return
	 */
	public boolean isHazardous();
}
