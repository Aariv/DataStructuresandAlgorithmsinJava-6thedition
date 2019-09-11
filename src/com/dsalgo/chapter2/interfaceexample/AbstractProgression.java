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
package com.dsalgo.chapter2.interfaceexample;

/**
 * @author aariv
 *
 */
public abstract class AbstractProgression {

	protected long current;

	public AbstractProgression() {
		this(0);
	}

	public AbstractProgression(long start) {
		current = start;
	}

	public long nextValue() {
		long answer = current;
		advance(); // this protected call is responsible for advancing the current value
		return answer;
	}

	public void printProgression(int n) {
		System.out.print(nextValue());
		for (int i = 1; i < n; i++)
			System.out.print(" " + nextValue());
		System.out.println();
	}

	protected abstract void advance();
}
