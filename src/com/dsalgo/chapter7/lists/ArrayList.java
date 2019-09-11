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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author aariv
 *
 */
public class ArrayList<E> implements List<E> {

	// instance variables
	public static final int CAPACITY = 16;

	private E[] data;
	private int size = 0;

	public ArrayList() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/**
	 * O(1)
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * O(1)
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * O(1)
	 */
	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	private void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i > n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	/**
	 * O(1)
	 */
	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	/**
	 * O(n)
	 */
	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);

		if (size == data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k]; // start by shifting right most
		data[i] = e; // ready to place new element
		size++;
	}

	/**
	 * O(n)
	 */
	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++) // shift elements to fill the hole
			data[k] = data[k + 1];
		data[size - 1] = null;
		size--;
		return temp;
	}

	class ArrayIterator implements Iterator<E> {

		private int j = 0;
		private boolean removable = false;

		@Override
		public boolean hasNext() {
			return j < size;
		}

		@Override
		public E next() {
			if (j == size)
				throw new NoSuchElementException("No next element");
			removable = true;
			return data[j++];
		}

		public void remove() {
			if (!removable)
				throw new IllegalStateException("No elemements to remove");
			ArrayList.this.remove(j - 1);
			j--;
			removable = false;
		}

	}

	public Iterator<E> iterator() {
		return new ArrayIterator();
	}
}
