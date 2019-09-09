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
package com.dsalgo.chapter7.lists;

/**
 * @author zentere
 *
 */
public class ListTest {

	public static void main(String[] args) {
		List<Integer> integerLists = new ArrayList<>();
		integerLists.add(1, 12);
		integerLists.add(2, 13);

		integerLists.add(3, 14);
		integerLists.add(4, 16);
		integerLists.add(5, 17);

		// Can't iterate integerLists
		
		// for (Integer integer : integerLists) {
		// System.out.println(integer);
		// }
	}
}
