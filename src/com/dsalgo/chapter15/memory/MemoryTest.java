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
package com.dsalgo.chapter15.memory;

/**
 * @author zentere
 *
 */
public class MemoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MemoryTest memoryTest = new MemoryTest();
		memoryTest.start();
	}

	public void start() {
		String last = "Z"; // this creates new String in Heap memory and set reference in stack memory
		/*
		 * This creates new Container Object in Heap Memory and set reference in stack
		 * memory.
		 * 
		 * The new Container object will contain initials variable and a new String
		 * variable will be created in Heap memory with value 'A' and sets reference in Container object
		 */
		Container container = new Container();
		container.setInitials("C"); // This will create new String C in Heap memory and the initial variable will set reference to String 'C'
		another(container, last);
		System.out.print(container.getInitials()); // B -> The state of the value is changed before it set reference to initial2 object
	}

	/*
	 * Copy of container and last varialbe is set to initialHolder and newInitial String variable
	 */
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase(); // this will create new String object in Heap memory and the value will be 'z'.
		initialHolder.setInitials("B"); // A new String object will be created in Heap Memory and value will be 'B'
		/*
		 * A new Container object will be created with reference initial2 in stack memory and Container Object will contain value String 'A' which will be created.
		 */
		Container initial2 = new Container();
		// initial2 will be assigned to initialHolder 
		initialHolder = initial2;
		System.out.print(initialHolder.getInitials()); // this will print A
		System.out.print(newInitial); // this will print Z
	}
}

class Container {
	private String initials = "A";

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initial) {
		this.initials = initial;
	}
}