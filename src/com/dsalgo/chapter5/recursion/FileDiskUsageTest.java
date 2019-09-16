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
package com.dsalgo.chapter5.recursion;

import java.io.File;

/**
 * @author zentere
 *
 */
public class FileDiskUsageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File root = new File("/home/zentere/Videos");
		System.out.println(diskUsage(root));
	}

	private static long diskUsage(File root) {
		long total = root.length();
		if (root.isDirectory()) {
			for (String childName : root.list()) {
				File child = new File(root, childName);
				total += diskUsage(child);
			}
		}
		System.out.println(total + "\t" + root);
		return total;
	}

}
