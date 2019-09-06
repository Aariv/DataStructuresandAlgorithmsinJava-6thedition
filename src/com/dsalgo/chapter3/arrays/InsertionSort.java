/**
 * 
 */
package com.dsalgo.chapter3.arrays;

import java.util.Arrays;

/**
 * @author zentere
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		char[] alpabets = { 'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F' };

		insertionSort(alpabets);
	}

	private static void insertionSort(char[] alpabets) {
		int n = alpabets.length;

		for (int k = 1; k < n; k++) { // begin with second char
			char cur = alpabets[k];
			int j = k; // find correct index j for cur
			while (j > 0 && alpabets[j - 1] > cur) { // j-1 must go after cur
				alpabets[j] = alpabets[j - 1]; // slide data[j -1] rightward
				j--; // and consider previous j for cur
			}

			alpabets[j] = cur; // correct place for cur
			System.out.println(Arrays.toString(alpabets));
		}
	}
}
