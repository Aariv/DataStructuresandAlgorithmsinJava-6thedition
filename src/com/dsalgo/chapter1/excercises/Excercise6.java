/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * 
 * Write a short Java method that takes an integer n and returns the sum of all
 * the odd positive integers less than or equal to n.
 * 
 * @author ariv
 *
 */
public class Excercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfOddNumbers(5)); // 9 will be the answer
	}

	/**
	 * Method to add all odd positive integers till n
	 * 
	 * @param n
	 * @return
	 */
	public static int sumOfOddNumbers(int n) {
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * Method to add all odd positive integers till n iteratively
	 * 
	 * @param n
	 * @return
	 */
	public static int sumOfOddPositive(int n) {
		int sum = 0;
		/**
		 * iterate using steps of 2 to take only odd integers 
		 * Ex : n = 5
		 * 
		 * when i = 1, sum = 0 + 1 = 1
		 * when i = 3, sum = 1 + 3 = 4
		 * when i = 5, sum = 4 + 5 = 9
		 */
		for (int i = 1; i <= n; i = i + 2) {
			sum += i;
		}
		// return 9 as result 
		return sum;
	}
}
