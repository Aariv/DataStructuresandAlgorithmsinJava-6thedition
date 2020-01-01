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
public class SinglyLinkedList<E> {
	SNode<E> head;
	int size = 0;

	public int size() {
		return size;
	}

	public E first() {
		return head.data;
	}

	public E removeFirst() {
		if(isEmpty())
			return null;
		SNode<E> e = head;
		head = head.next;
		size--;
		return e.data;
	}

	public void addFirst(E e) {
		SNode<E> newNode = new SNode<>(e);
		if (head == null) {
			size++;
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
			size++;
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}
}

class SNode<E> {
	E data;
	SNode<E> next;

	SNode() {

	}

	SNode(E e) {
		this.data = e;
	}
}
