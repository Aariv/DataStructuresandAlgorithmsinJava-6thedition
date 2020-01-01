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

package com.dsalgo.chapter6.stack;

import java.util.Stack;

/**
 * 
 * @author zentere
 *
 */
public class StackDemo {

	Stack<Integer> stack;
	
	public static void main(String[] args) {
		String s = "{([a+b] * [a-b]) / e}";
		isValid(s);
	}

	public static boolean isValid(String s) {
		Stack<Character> result = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char res = 0;
			if (ch == '{' || ch == '(' || ch == '[') {
				result.push(ch);
			}
			if (ch == '}' || ch == ')' || ch == ']') {
				if (result.isEmpty()) {
					return false;
				}
				res = result.pop();
			}
			if (ch == res) {
				System.out.println(ch);
			}
		}
		if (result.isEmpty()) {
			return true;
		}
		return false;
	}
}
