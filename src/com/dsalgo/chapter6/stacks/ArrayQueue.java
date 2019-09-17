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
package com.dsalgo.chapter6.stacks;

/**
 * @author zentere
 *
 */
public class ArrayQueue<E> implements Queue<E> {

	private E[] data;

	private int first = 0;

	private int size = 0;

	private static final int CAPACITY = 10;

	public ArrayQueue() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(E e) {
		if (size == data.length)
			throw new IllegalStateException("Queue is full");
		int avail = (first + size) % data.length;
		data[avail] = e;
		size++;
	}

	@Override
	public E first() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
		return data[first];
	}

	@Override
	public E dequeue() {
		if (isEmpty())
			return null;
		E answer = data[first];
		data[first] = null;
		first = (first + 1) % data.length;
		size--;
		return answer;
	}

	public void display() {
		for (E e : data) {
			System.out.print(e + "|");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayQueue<Integer> iList = new ArrayQueue<>();
		iList.enqueue(12);
		iList.enqueue(13);
		iList.display();
		System.out.println(iList.dequeue());
		iList.display();
		iList.enqueue(15);
		iList.enqueue(16);
		iList.display();
	}
}
