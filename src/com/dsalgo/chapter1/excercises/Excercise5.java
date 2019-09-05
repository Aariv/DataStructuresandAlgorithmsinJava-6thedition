/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n.
 * 
 * @author ariv
 *
 */
public class Excercise5 {

	public static void main(String[] args) {
		System.out.println(sum(5)); // 15 will be the result
	}

	/**
	 * Method to add all positive integers till n
	 * 
	 * @param n
	 * @return
	 */
	public static int sum(int n) {
		// local variable to store the sum of positive integers
		int sum = 0;
		/**
		 * Ex: n = 5;
		 * 
		 * when i = 1, sum = 0 + 1 = 1
		 * when i = 2, sum = 1 + 2 = 3
		 * when i = 3, sum = 3 + 3 = 6
		 * when i = 4, sum = 6 + 4 = 10
		 * when i = 5, sum = 10 + 5 = 15
		 */
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		// return 15 as the sum of postive integers
		return sum;
	}
}
