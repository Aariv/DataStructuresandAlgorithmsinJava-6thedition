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
public class MergeArrays {

	public static void main(String[] args) {
		int[] A = { 3, 8, 16, 20, 25 };
		int[] B = { 4, 10, 12, 22, 23 };
		int i = 0, j = 0, k = 0;
		int m = A.length;
		int n = B.length;
		int[] C = new int[m + n];

		while (i < m && j < n) {
			if (A[i] < B[j])
				C[k++] = A[i++];
			else
				C[k++] = B[j++];
		}

		// copy remaining elements from any of the list a, b
		for (; i < m; i++)
			C[k++] = A[i];
		for (; j < n; j++)
			C[k++] = B[j];

		System.out.println("After merging");
		for (i = 0; i < C.length; i++)
			System.out.print(C[i]);
	}
}
