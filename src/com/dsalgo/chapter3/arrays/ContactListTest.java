/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author zentere
 *
 */
public class ContactListTest {

	public static void main(String[] args) {
		ContactList contactList = new ContactList(5);
		
		contactList.add(new Contact("Ariv", "9856783490", "+91", "INDIAN"));
		contactList.add(new Contact("Adam", "3457689089", "+1", "USA"));
		
		contactList.display();
		
		System.out.println(contactList.get("Arivu"));
	}
}
