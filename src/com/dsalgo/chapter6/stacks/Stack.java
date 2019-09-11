/**
 * 
 */
package com.dsalgo.chapter6.stacks;

/**
 * @author aariv
 *
 */
public class Stack {
	public static int SIZE = 10;
	public static int top = 0;

	public static int[] s = new int[SIZE];

	public static boolean isEmpty() {
		if (top == 0)
			return true;
		return false;
	}

	public static void push(int x) {
		top += 1;
		if (top > SIZE)
			System.out.println("StackOverflow");
		else
			s[top] = x;
	}

	public static int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else
			top -= 1;
		return s[top + 1];
	}

	public static void main(String[] args) {
		System.out.println(pop());
		push(10);
		push(11);
		push(12);
		push(13);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
}
