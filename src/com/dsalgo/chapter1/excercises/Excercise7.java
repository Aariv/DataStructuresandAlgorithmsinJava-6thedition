/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a short Java method that takes an integer n and returns the sum of the
 * squares of all positive integers less than or equal to n.
 * 
 * @author zentere
 *
 */
public class Excercise7 {

	public static void main(String[] args) {
		System.out.println(sumSqures(5));
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int sumSqures(int n) {
		int sum = 0;
		/**
		 * when i = 1, sum = 0 + (1 * 1) = 1
		 * when i = 2, sum = 1 + (2 * 2) = 5
		 * when i = 3, sum = 5 + (3 * 3) = 14
		 * when i = 4, sum = 14 + (4 * 4) = 16 + 14 = 30
		 * when i = 5, sum = 30 + (5 * 5) = 25 + 30 = 55
		 */
		for (int i = 1; i <= n; i++) {
			sum += (i * i);
		}
		// return result 55
		return sum;
	}
}
