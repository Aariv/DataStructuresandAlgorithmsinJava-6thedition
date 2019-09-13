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

class DoubleList<E> implements Base<E>, Cloneable {

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
		/*
		 * Last element is available at previous of Tail Node
		 */
		return trailer.getPrev().getElement();
	}

	@Override
	public void addFirst(E e) {
		// It should be added in between head and head's next node.
		addBetween(header, e, header.getNext());
	}
	
	@Override
	public void addLast(E e) {
		/*
		 * This also should be added in between the tail and tail's previous node
		 */
		addBetween(trailer.getPrev(), e, trailer);
	}

	/**
	 * 
	 * @param predecessor
	 * @param e
	 * @param successor
	 */
	private void addBetween(Node<E> predecessor, E e, Node<E> successor) {
		/*
		 * Create new node with predecessor and successor
		 */
		Node<E> newest = new Node<>(predecessor, e, successor);
		// set next 
		predecessor.setNext(newest);
		// set previous
		successor.setPrev(newest);
		size++;
	}
	
	@Override
	public E removeFirst() {
		if(isEmpty())
			return null;
		return remove(header.getNext());
	}

	private E remove(Node<E> node) {
		// Get previous node
		Node<E> predecessor = node.getPrev();
		// Get next node
		Node<E> successor = node.getNext();
		// previous node is head and make head's next to point to given node's next node
		predecessor.setNext(successor);
		// Given X node's previous node should be pointing to head node
		successor.setPrev(predecessor);
		size--; // element has no link so reduce by 1
		return node.getElement(); // return the result
	}
	
	private E remove(E e) {
		Node<E> current = header;
		
		for(int i = 1; i < size; i++) {
			if(current.getElement().equals(e)) {
				break;
			}
			current = current.getNext();
		}
		remove(current);
		return current.getElement();
	}

	@Override
	public E removeLast() {
		if(isEmpty())
			return null;
		return remove(trailer.getPrev());
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
	
//	@Override
//	protected DoubleList<E> clone() throws CloneNotSupportedException {
//		DoubleList<E> other = (DoubleList<E>) super.clone();
//		if(size > 0) {
//			other.header = new Node<>(null, header.getElement(), null);
//			Node<E> walk = header.getNext();
//			Node<E> otherTail = other.header;
//			
//		}
//			
//		//return super.clone();
//	}
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
