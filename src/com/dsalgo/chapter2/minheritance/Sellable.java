/**
 * 
 */
package com.dsalgo.chapter2.minheritance;

/**
 * @author aariv
 *
 */
public interface Sellable {

	/**
	 * returns a description of the object
	 * 
	 * @return
	 */
	public String description();

	/**
	 * Returns the list price in cents
	 * 
	 * @return
	 */
	public int listPrice();

	/**
	 * Returns the lowest price in cents we will accept
	 * 
	 * @return
	 */
	public int lowestPrice();

}
