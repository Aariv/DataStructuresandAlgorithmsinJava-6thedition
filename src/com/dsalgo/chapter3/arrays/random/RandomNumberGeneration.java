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
package com.dsalgo.chapter3.arrays.random;

import java.util.Arrays;
import java.util.Random;

/**
 * @author zentere
 * 
 *         next = (a * cur + b) % n;
 *
 */
public class RandomNumberGeneration {

	public static void main(String[] args) {
		int data[] = new int[10];
		/*
		 * pseudo random number generator
		 */
		Random random = new Random();

		random.setSeed(System.currentTimeMillis()); // use current time as a seed

		// fill the data array with pseudo-random numbers from 0 - 99 inclusive
		for (int i = 0; i < data.length; i++)
			data[i] = random.nextInt(100); // the next pseudo random number

		int[] orig = Arrays.copyOf(data, data.length); // make of a copy the data array

		System.out.println("Arrays are equal before sort: " + Arrays.equals(data, orig));

		Arrays.sort(data);

		System.out.println("arrays are equal after sort: " + Arrays.equals(data, orig));

		System.out.println("Orig " + Arrays.toString(orig));

		System.out.println("Data " + Arrays.toString(data));

	}
}
