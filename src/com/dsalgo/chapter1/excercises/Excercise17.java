/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a short Java method that takes an array of int values and determines if
 * there is a pair of distinct elements of the array whose product is even.
 * 
 * @author ariv
 *
 */
public class Excercise17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n[] = { 1, 2, 5, 8 };
		
		// ex: for array [2,2,2,5,8]

		findEvenProduct(n);
	}

	/**
	 * 
	 * @param n
	 */
	private static void findEvenProduct(int[] n) {
		for (int i = 0; i <= n.length - 1; i++) {
			if (n[i] % 2 == 0) {
				System.out.println("Pair found at index " + i + " Element" + n[i]);
				break;
			}
		}
	}

}
