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
package com.dsalgo.chapter3.doublylinkedlist;

import com.dsalgo.chapter3.singlylinkedlist.Base;

/**
 * @author zentere
 *
 */
public class DListTest {

	public static void main(String[] args) {
		DoubleList<Integer> dList = new DoubleList<>();
		dList.addFirst(12);
		dList.addFirst(13);
		dList.addFirst(14);
		
		dList.displayForward();
		dList.displayBackward();
		
		System.out.println("=== For String ========");
		
		DoubleList<String> dListString = new DoubleList<>();
		dListString.addFirst("Ariv");
		dListString.addFirst("Asai");
		dListString.addFirst("Vivek");
		
		dListString.displayForward();
		dListString.displayBackward();
	}
}

class DoubleList<E> implements Base<E> {

	// instance variables
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	public DoubleList() {
		header = new Node<>(null, null, null); // header sentinel i.e dummy node
		trailer = new Node<>(header, null, null); // trailer sentinel node
		header.setNext(trailer);
		/*
		 * The above represents following
		 *  
		 *  header
		 *  _ _ _      _ _ _
		 * |_|_|t|<-->|h|_|null|
		 * 
		 * Whatever we are going to insert in doubly lined list will be added in between header sentinels and trailer sentiels
		 *
		 */
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
		// get first element. Always first element will be Header's next point
		return header.getNext().getElement();
	}

	@Override
	public E last() {
		return trailer.getPrev().getElement();
	}

	@Override
	public void addFirst(E e) {
		addBetween(header, e, header.getNext());
	}
	
	@Override
	public void addLast(E e) {
		addBetween(trailer.getPrev(), e, trailer);
	}

	/**
	 * 
	 * @param predecessor
	 * @param e
	 * @param successor
	 */
	private void addBetween(Node<E> predecessor, E e, Node<E> successor) {
		Node<E> newest = new Node<>(predecessor, e, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	@Override
	public E removeFirst() {
		return null;
	}

	@Override
	public E removeLast() {
		return null;
	}

	@Override
	public E remove(int i) {
		return null;
	}
	
	public void displayForward() {
		Node<E> current = header;
		while(current != null) {
			System.out.print(current.getElement() + "->");
			current = current.getNext();
		}
		System.out.println();
	}
	
	public void displayBackward() {
		Node<E> current = trailer;
		while(current != null) {
			System.out.print(current.getElement() + "<-");
			current = current.getPrev();
		}
		System.out.println();
	}
}

class Node<E> {
	private Node<E> prev;
	private E element;
	private Node<E> next;

	public Node(Node<E> p, E e, Node<E> n) {
		prev = p;
		element = e;
		next = n;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> p) {
		prev = p;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E e) {
		element = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> n) {
		next = n;
	}
}
