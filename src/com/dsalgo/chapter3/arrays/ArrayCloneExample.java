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
public class ArrayCloneExample {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		
		int b[] = a; // it is not copy it is referring the array a
		
		/*
		 * b[0] = 10 it will affect both a and b array
		 */
		b[0] = 10;
		System.out.println("Array A : " + a[0]);
		System.out.println("Array B : " + b[0]);
		
		/*
		 * So in order to make copy of the array we have to use clone method from array
		 * 
		 * This is also called as shallow copy
		 */
		int c[] = a.clone();
		
		c[0] = 12;
		System.out.println("===================");
		System.out.println("Array A : " + a[0]);
		System.out.println("Array B : " + b[0]);
		System.out.println("Array C : " + c[0]);
		
		/*
		 * Deep copy
		 */
		
	}
}
