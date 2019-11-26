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

package com.dsalgo.chapter3.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int A[] = { 8, 3, 9, 15, 16, 7, 12, 4 };
		int B[] = new int[8];
		for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
			B[j] = A[i];
		// copy to array A
		for (int i = 0; i < A.length; i++)
			A[i] = B[i];

		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

	}
}
