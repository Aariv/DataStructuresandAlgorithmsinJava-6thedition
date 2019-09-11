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
package com.dsalgo.chapter3.circlarlylinkedlist;

import com.dsalgo.chapter3.circlarlylinkedlist.CircularlyLinkedListV2.Node;
import com.dsalgo.chapter3.singlylinkedlist.Base;

/**
 * @author aariv
 *
 */
public class CircularlyLinkedListV2<E> implements Base<E> {
	static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	// instance variable
	private Node<E> tail = null;

	private int size = 0;

	public CircularlyLinkedListV2() {
		// TODO Auto-generated constructor stub
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
	public E first() {
		if (isEmpty())
			return null;

		return tail.getNext().getElement(); // head placed is after tail
	}

	@Override
	public E last() {
		return tail.getElement();
	}

	@Override
	public void addFirst(E e) {
		if (size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);
		} else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}

	@Override
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}

	@Override
	public E removeFirst() {
		if (isEmpty())
			return null;
		Node<E> head = tail.getNext();
		if(head == tail)
			tail = null;
		else
			tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	// access methods
}

class CList<E> {
	private E element;
	private Node<E> next;

	public CList(E e, Node<E> nxt) {
		element = e;
		next = nxt;
	}

	public E getElement() {
		return element;
	}

	public Node<E> getNext() {
		return next;
	}
}