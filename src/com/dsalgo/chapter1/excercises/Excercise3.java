/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * 
 * Write a short Java method, isMultiple, that takes two long values, n and m,
 * and returns true if and only if n is a multiple of m, that is, n = mi for
 * some integer i.
 * 
 * @author Ariv
 *
 */
public class Excercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMultiple(500L, 1500L));
	}

	/**
	 * Check whether a long value of (m) is a multiple of another long value(n)
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static boolean isMultiple(long n, long m) {
		// Check if m is greater than n. If it is smaller make n as bigger one so that
		// we can multipy the values
		if (m > n)
			return isMultiple(m, n);
		// if it is multiplied return true
		if (n % m == 0)
			return true;

		return false;
	}
}
