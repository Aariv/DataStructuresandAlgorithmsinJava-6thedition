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
package com.dsalgo.chapter6.stack;

/**
 * @author zentere
 *
 */
public class ArrayStack<E> implements IStack<E> {

	public static final int CAPACITY = 1000;
	public int top = -1;
	public E[] data;

	public ArrayStack() {
		this(CAPACITY);
	}

	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsalgo.chapter6.stack.IStack#size()
	 */
	@Override
	public int size() {
		return (top +1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsalgo.chapter6.stack.IStack#push(java.lang.Object)
	 */
	@Override
	public void push(E e) {
		if(size() == data.length)
		{
			System.out.println("Stack is full");
			return;
		}
		data[++top] = e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsalgo.chapter6.stack.IStack#top()
	 */
	@Override
	public E top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return data[top];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsalgo.chapter6.stack.IStack#pop()
	 */
	@Override
	public E pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		E ans = data[top];
		data[top] = null;
		top--;
		return ans;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dsalgo.chapter6.stack.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

}
