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
public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A[] = new int[10];
		A[0] = 4;
		A[1] = 8;
		A[2] = 13;
		A[3] = 16;
		A[4] = 20;
		A[5] = 25;
		int length = 6;
		int size = 10;
		A = insertSort(A, length, size, 14);
		for (int i = 0; i < A.length; i++)
			System.out.println(A[i]);
	}

	private static int[] insertSort(int[] A, int length, int size, int value) {
		int i = length - 1;
		// shift elements
		while (i >= 0 && A[i] > value) {
			A[i + 1] = A[i];
			i--;
		}
		A[i + 1] = value;
		return A;
	}

}
