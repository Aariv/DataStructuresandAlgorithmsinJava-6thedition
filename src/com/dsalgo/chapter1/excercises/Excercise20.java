/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a Java method that takes an array of float values and determines if all
 * the numbers are different from each other (that is, they are distinct).
 * 
 * @author ariv
 *
 */
public class Excercise20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float nums[] = { 2.0f, 3.0f, 4.0f, 5.0f, 2.0f };
		int count = 0;
		try {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] != nums[i + 1]) {
					count++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Bound Exception");
		}

		if (count == nums.length -1) {
			System.out.println("All elements are distinct");
		}
	}

}
