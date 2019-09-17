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
public class StackMemoryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int localValue = 5;
		calculate(localValue);
		System.out.println("Local Value: " + localValue);
		
		String value = "Ariv";
		changeName(value);
		System.out.println(value);
		
		Customer c = new Customer("Sally");
		
		renameCustomer(c);
		
		System.out.println(c.getName());
	}

	private static void renameCustomer(Customer c) {
		c.setName("Diane");
	}

	/*
	 * Passing by value - Example
	 * 
	 * Passing by reference is not possible in Java.
	 * 
	 * calcValue has copy of localValue.
	 * 
	 * Passing value to any method in java will consider as copy of a variable.
	 */
	public static void calculate(int calcValue) {
		calcValue *= 100;
	}
	
	public static void changeName(String arivName) {
		arivName = arivName + "Asai";
	}
}

class Customer {
	private String name;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String custName) {
		name = custName;
	}
	
	public void setName(String custName) {
		name = custName;
	}
	
	public String getName() {
		return name;
	}
}

