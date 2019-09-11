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
package com.dsalgo.chapter1;

/**
 * @author aariv
 *
 */
public class BaseTypeTest {

	public static void main(String[] args) {
		boolean isCapable = true; // only two values i.e true / false

		char c = 'c'; // 16 bit Unicode Character

		System.out.println(c);

		byte b = 127; // 8 bit signed two's complement integer

		/*
		 * this will throw compliation error. Becase byte can hold from 0 to 127 only
		 */
		// byte b2 = 128;
		
		short s = 32767; // 16 bit signed twos' complement integer
		/*
		 * Below will throw complier exception  as it exceeds the range. -32767	 to 32767 for short
		 */
		//short s2 = 327676; // 
		// This is wrapper class for short type
		//Short sh3  = 32768;
		
		int i = 78; // 2^31 32 bits of 2 possible states = 2^32=4,294,967,296 possible values.
		i = 2147483647; //32 bits signed integer
		/*
		 * Signed means - this can accept both positive and negative numbers
		 */
		/*
		 *Compilation error 
		 */
		//i = 2147483648;
	}
}
