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
package com.dsalgo.chapter3.arrays.sorting;

import java.util.Arrays;

/**
 * @author zentere
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		char[] data = { 'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F' };
		insertionSort(data);
	}

	private static void insertionSort(char[] data) {
		int n = data.length; // size of the char array

		for (int k = 1; k < n; k++) { // begin with second character
			char cur = data[k]; // time to insert current char
			int j = k; // find correct index for j for curr.
			// loop until the element is less than given char
			while (j > 0 && data[j - 1] > cur) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = cur;
		}
		System.out.println(Arrays.toString(data));
	}
}
