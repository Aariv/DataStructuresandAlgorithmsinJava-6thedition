/*
 * Copyright 2019, Arivazhagan L.
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package com.dsalgo.chapter3.arrays.methods;

import java.util.Arrays;

/**
 * @author aariv
 *
 */
public class ArrayUtilMethodsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] a = { 'A', 'B', 'C' };
		char[] a2 = { 'A', 'B', 'C' };

		System.out.println(Arrays.equals(a, a2));
		/*
		 * store value (B) every cell of array A.
		 */
		Arrays.fill(a, 'B');

		System.out.println("Array A: " + Arrays.toString(a));
		/*
		 * Returns an array of size n
		 */
		char[] c = Arrays.copyOf(a, 10);
		System.out.println(c.length);
		/*
		 * returns string representation of the array A. Beginning with [] ends with
		 * seperated string .
		 */
		Arrays.toString(a); //
		/*
		 * Sort the Array A based on a natural ordering of its element which must be
		 * comparable. Based on Sorting Algorithms.
		 */
		Arrays.sort(a);
		/*
		 * Searches the sorted array A for value x, returning the index where it is
		 * found, or else the index of where it could be inserted whilie maintaining the
		 * sorted order.
		 */
		Arrays.binarySearch(a, 'A');
	}

}
