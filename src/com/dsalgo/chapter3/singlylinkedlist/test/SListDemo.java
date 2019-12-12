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
package com.dsalgo.chapter3.singlylinkedlist.test;

/**
 * @author zentere
 *
 */
public class SListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.display();
		// ll.initialize(10);
		ll.display();
		ll.addAtHead(10);
		ll.addAtHead(20);
		ll.addAtHead(30);
		ll.addAtHead(40);
		ll.display();
		ll.addAtEnd(90);
		ll.addAtEnd(100);
		ll.display();
		ll.add(95, 5);
		ll.display();

		// merge
		LinkedList sl1 = new LinkedList();
		sl1.addAtEnd(10);
		sl1.addAtEnd(20);
		sl1.addAtEnd(30);
		sl1.addAtEnd(40);

		LinkedList sl2 = new LinkedList();
		sl2.addAtEnd(50);
		sl2.addAtEnd(60);
		sl2.addAtEnd(70);
		sl2.addAtEnd(80);

		sl1.mergeList(sl1.head, sl2.head);
		sl1.display();

		ll.deleteAtHead();
		ll.display();
		ll.deleteAtEnd();
		ll.display();
		ll.delete(2);
		ll.display();
		ll.reverse();
		ll.display();
		ll.displayReverse();
		ll.display();
	}
}

class LinkedList {
	ListNode head;
	int size;
	
	public void displayReverse() {
		reverseVisit(head);
		System.out.println();
	}
	
	private void reverseVisit(ListNode head2) {
		if(head2 ==null)
			return;
		else {
			reverseVisit(head2.next);
			System.out.print(head2.val + "=>");
		}
		
	}

	public void reverse() {
		ListNode current = head;
		ListNode p = null;
		ListNode r = null;
		
		while(current != null) {
			r = p;
			p = current;
			current = current.next;
			
			p.next = r;
		}
		head = p;
	}

	public void deleteList() {
		head = null;
	}

	public void delete(int position) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (position > size) {
			System.out.println("Out of index. Position can't find in this list");
			return;
		}
		ListNode current = head;
		ListNode prev = null;
		for (int i = 1; i < position; i++) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
		size--;
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		ListNode current = head;
		ListNode prev = null;
		while (current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		size--;
	}

	public void deleteAtHead() {
		if (head == null) {
			System.out.println("List is empty..");
			return;
		}
		head = head.next;
		size--;
	}

	public void mergeList(ListNode l1, ListNode l2) {
		if (l1 != null && l2 != null) {
			while (l1.next != null) {
				l1 = l1.next;
			}
			l1.next = l2;
		}
	}

	public void add(int value, int pos) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		if (pos > size) {
			System.out.println("Out of index. Position can't find in this list");
			return;
		}
		ListNode current = head;
		for (int i = 1; i < pos; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		size++;
	}

	// add at the end of the linked list
	public void addAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	// add at the head of the list
	public void addAtHead(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}

	// add some dummy node
	public void initialize(int n) {
		ListNode dummy = new ListNode(-1);
		for (int i = 1; i <= n; i++) {
			int value = getRandom(0, 9);
			ListNode newData = new ListNode(value);
			dummy.next = newData;
			dummy = dummy.next;
		}
	}

	private int getRandom(int i, int j) {
		return (int) (Math.random() * (j + 1 - i)) + i;
	}

	// display nodes
	public void display() {
		ListNode current = head;
		if (current == null) {
			System.out.println("List is empty...");
			return;
		}
		while (current != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.println();
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}