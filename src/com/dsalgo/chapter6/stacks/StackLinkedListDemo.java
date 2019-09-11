/**
 * 
 */
package com.dsalgo.chapter6.stacks;

/**
 * @author aariv
 *
 */
public class StackLinkedListDemo {

}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LStack {
	private Node head;
	private Node top;

	public LStack() {
		head = null;
		top = null;
	}

	public void traversal() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println("");
	}

	public boolean isEmpty() {
		if (this.top == null)
			return true;
		return false;
	}
}