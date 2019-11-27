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
public class CountOccurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A[] = { 3, 6, 8, 8, 10, 12, 15, 15, 20 };

		int n = 9;

		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1]) {
				int j = i + 1;
				while (A[j] == A[i])
					j++;
				System.out.println(A[i] + " appearing " + (j - i) + " times");
				i = j -1;
			}
		}
	}

}
