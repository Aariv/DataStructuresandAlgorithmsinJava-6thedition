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
package com.dsalgo.chapter3.singlylinkedlist;

import com.dsalgo.chapter3.singlylinkedlist.SinglyLinkedList.Node;

/**
 * @author zentere
 *
 */
public class SList<E> implements Base<E> {

	// define head and tail

	private Node<E> head;
	private Node<E> tail;
	private int size;

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
		return head.getElement();
	}

	@Override
	public E last() {
		return tail.getElement();
	}

	@Override
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	@Override
	public void addLast(E e) {
		// create new element
		Node<E> newNode = new Node<E>(e, null);
		if (isEmpty())
			head = newNode;
		else
			tail.setNext(newNode);
		size++;
	}

	@Override
	public E removeFirst() {
		if (isEmpty())
			return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;

		return answer;
	}

	public void displayList() {
		Node<E> current = head;
		while (current != null) {
			System.out.println(current.getElement());
			current = current.getNext();
		}
	}

	public static void main(String[] args) {
		SList<String> str = new SList<>();
		str.addFirst("Ariv");
		str.addFirst("Zakir");
		str.addFirst("Vivek");

		System.out.println("============= Display ======");

		str.displayList();

		str.addLast("Siva");

		System.out.println("============= Display ======");

		str.displayList();
		System.out.print(" " + str.size());
		
		str.removeFirst();

		System.out.println("============= Display ======");

		str.displayList();
		System.out.print(" " + str.size());
	}
}

class SNode<E> {
	private E element;
	private Node<E> next;

	public SNode(E e, Node<E> nxt) {
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
