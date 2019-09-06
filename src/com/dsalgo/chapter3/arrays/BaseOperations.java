/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author zentere
 *
 */
public interface BaseOperations<E> {

	public void add(E item);

	public void add(int position, E item);

	public void remove(E item);

	public void remove(int position);

	public void clear();

	public int size();
}
