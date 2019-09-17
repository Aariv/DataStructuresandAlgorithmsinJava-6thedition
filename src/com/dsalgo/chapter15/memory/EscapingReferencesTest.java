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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zentere
 *
 *         There are cases where we specify objects which may lead to modify the
 *         records. To avoid those situation we can do the following ways
 *         specified in this program
 */
public class EscapingReferencesTest {

	public static void main(String[] args) {
		CustomerRecords customerRecords = new CustomerRecords();
		customerRecords.addCustomer(new CCustomer("Ariv"));
		customerRecords.addCustomer(new CCustomer("Siva"));
		/*
		 * this statement will change the state of the object so this will clear the
		 * current object value and none will be printed. To avoid this we have to
		 * return unmodifiable list
		 * 
		 * UnsupportedOperationException will happen when a list is unmodifiable
		 */
		// customerRecords.getCustomers().clear();

		for (CCustomer cust : customerRecords.getCustomers().values()) {
			System.out.println(cust);
			//cust.setName("Dai"); this will change the state of customer object. So to avoid this we have to make use of copy constructor
		}
		
		for (CCustomer cust : customerRecords.getCustomers().values()) {
			System.out.println(cust);
		}

		CustomerReadOnly ariv = customerRecords.getCustomerByName("Ariv");
		
		System.out.println(ariv.getName());
		
		//ariv.setName("Ariv-Asai");

		System.out.println();
		for (CCustomer cust : customerRecords.getCustomers().values()) {
			System.out.println(cust);
		}

		CCustomer cust = new CCustomer("John");
		String name = cust.getName();
		name = "Zakir";
		System.out.println(name);
		System.out.println(cust.getName());
	}
}

class CCustomer implements CustomerReadOnly {
	private String name;

	public CCustomer(String name) {
		this.name = name;
	}
	
	public CCustomer(CCustomer oldCustomer) {
		this.name = oldCustomer.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

interface CustomerReadOnly {
	
	public abstract String getName();
	public abstract String toString();
	
}
class CustomerRecords {
	private Map<String, CCustomer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, CCustomer>();
	}

	public void addCustomer(CCustomer c) {
		this.records.put(c.getName(), c);
	}

	public Map<String, CCustomer> getCustomers() {
		return Collections.unmodifiableMap(this.records);
	}
	
	public CustomerReadOnly getCustomerByName(String key) {
		return this.records.get(key);
	}
}