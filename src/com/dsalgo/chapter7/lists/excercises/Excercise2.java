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
package com.dsalgo.chapter7.lists.excercises;

import java.util.ArrayList;

/**
 * @author zentere
 * 
 *         R-7.2 Give an implementation of the stack ADT using an array list for
 *         storage.
 *
 */
public class Excercise2<E> {

	private int capacity = 16;

	private ArrayList<E> arrayList;

	public Excercise2() {
		arrayList = new ArrayList<>(capacity);
	}

	public Excercise2(int capacity) {
		this.capacity = capacity;
		arrayList = new ArrayList<>(capacity);
	}

	public int size() {
		return arrayList.size();
	}

	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	/*
	 * The idea is to put the element e at index 'arraylist.size()' the top is at
	 * index 'arraylist.size() -1
	 */
	public void push(E e) {
		if (arrayList.size() == capacity)
			throw new IllegalStateException("Stack is full");
		arrayList.add(arrayList.size(), e);
	}

	public E top() {
		if (arrayList.size() == 0)
			return null;

		return arrayList.get(arrayList.size() - 1);
	}

	public E pop() {
		if (arrayList.size() == 0)
			return null;
		return arrayList.remove(arrayList.size() - 1);
	}
	
	public static void main(String[] args) {
		Excercise2<Integer> iList = new Excercise2<>();
		iList.push(12);
		iList.push(13);
		iList.push(14);
		iList.push(15);
		/*
		 * 15, 15,  14, 13
		 */
		System.out.println("Top element in stack: " + iList.top());
		System.out.println("Popped element in stack: " + iList.pop());
		System.out.println("Popped element in stack: " + iList.pop());
		System.out.println("Top element in stack: " + iList.top());
	}
}
