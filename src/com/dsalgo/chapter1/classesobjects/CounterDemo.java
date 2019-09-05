/**
 * 
 */
package com.dsalgo.chapter1.classesobjects;

/**
 * @author zentere
 *
 */
public class CounterDemo {

	public static void main(String[] args) {
		Counter counter; // declares a reference variable, no counter yet constructed
		// new operator returns the reference for the reference type
		counter = new Counter(); // constructs counter; assign its reference to counter variable

		counter.increment(); // increases its value by 1

		counter.increment(3); // increase its value by 3 -> 4 will be the value

		int temp = counter.getCount(); // 4 will be stored in temp variable

		counter.reset(); // counter will be 0 now

		Counter counter2 = new Counter(5); // counter is contructed with initial value 5

		counter2.increment(); // value incremented by 1 -> 6

		Counter counter3 = counter2; // assign counter 2 to counter 3

		temp = counter3.getCount();// 6 will be the value

		counter3.increment(4);

		System.out.println(counter2.getCount());
		System.out.println(counter3.getCount());

		Counter.badReset(counter3);

		System.out.println("After Reset: " + counter3.getCount());
		
		Counter.goodReset(counter3);

		System.out.println("After Good Reset: " + counter3.getCount());
	}
}

/**
 * Class are reference types in Java
 * 
 * @author zentere
 *
 */
class Counter {
	private int count; // a simple integer instance variable

	public Counter() { // default constructor Counter is 0

	}

	public Counter(int initial) { // an alternate constructor
		count = initial;
	}

	public int getCount() { // an accessor method
		return count;
	}

	public void increment() { // an update method
		count++;
	}

	public void increment(int value) { // an update method
		count += value;
	}

	public void reset() { // an update method
		count = 0;
	}

	public static void badReset(Counter c) {
		c = new Counter();
	}

	public static void goodReset(Counter c) {
		c.reset();
	}
}