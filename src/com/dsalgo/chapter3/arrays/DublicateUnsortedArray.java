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
package com.dsalgo.chapter3.arrays;

/**
 * @author zentere
 *
 */
public class DublicateUnsortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * O(n^2) 
		 */
		int A[] = { 8, 3, 6, 4, 6, 5, 6, 8, 2, 7 };
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (A[i] == A[j]) {
						count++;
						A[j] = -1;
					}
				}

				if (count > 1) {
					System.out.println(A[i] + " appearing " + count + " times");
				}
			}
		}
	}

}
