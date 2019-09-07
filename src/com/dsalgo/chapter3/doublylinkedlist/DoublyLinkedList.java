/**
 * 
 */
package com.dsalgo.chapter3.doublylinkedlist;

/**
 * @author zentere
 * @param <E>
 *
 */
public class DoublyLinkedList<E> {

	static class Node<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setPrev(Node<E> p) {
			prev = p;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	// instance variables
	private Node<E> header;
	private Node<E> tailer;

	private int size = 0;

	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		tailer = new Node<>(null, header, null);
		header.setNext(tailer);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return header.getNext().getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return tailer.getPrev().getElement();
	}

	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}

	public void addLast(E e) {
		addBetween(e, tailer.getPrev(), tailer);
	}

	public E removeFirst(E e) {
		if (isEmpty())
			return null;
		return remove(tailer.getPrev());
	}

	public E removeLast() {
		if (isEmpty())
			return null;
		return remove(tailer.getPrev());
	}

	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}

	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		predecessor.setPrev(newest);
		size++;
	}
}
