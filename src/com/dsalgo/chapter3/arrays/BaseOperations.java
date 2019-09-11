/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author aariv
 *
 */
public interface BaseOperations<E> {

	public void add(E item);

	public void add(int position, E item);

	public void remove(E item);

	public void remove(int position);

	public void clear();

	public int size();

	default E get(E item) {
		return item;
	}
	
	default E get(int position) {
		return null;
	}
	
	default E get(String element) {
		return null;
	}
}
