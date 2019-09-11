/**
 * 
 */
package com.dsalgo.chapter3.arrays;

import java.util.NoSuchElementException;

/**
 * @author aariv
 *
 */
public class ContactList implements BaseOperations<Contact> {

	private static final int CAPACITY = 10;
	private int size;

	private Contact[] contacts;

	public ContactList() {
		this(CAPACITY);
	}

	public ContactList(int capacity) {
		contacts = new Contact[capacity];
	}

	@Override
	public void add(Contact item) {
		int n = contacts.length;
		if (size < n)
			size++;
		int insertPosition = size - 1;
		contacts[insertPosition] = item;
	}

	@Override
	public void add(int position, Contact item) {
		int n = contacts.length;
		if (position < 0 || position >= n)
			throw new ArrayIndexOutOfBoundsException("Invalid index" + position);
		// shift left to right
		for (int i = n - 1; i > position; i--)
			contacts[i] = contacts[i - 1];

		contacts[position] = item;

		if (size < n)
			size++;
	}

	@Override
	public void remove(Contact item) {

	}

	@Override
	public void remove(int position) {

	}

	@Override
	public void clear() {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Contact get(Contact item) {
		for (Contact contact : contacts) {
			if (contact.equals(item))
				return item;

		}
		throw new NoSuchElementException("No element found");
	}

	@Override
	public Contact get(int position) {
		for (int i = 0; i < contacts.length; i++) {
			if (i == position)
				return contacts[i];

		}
		throw new NoSuchElementException("No element found");
	}

	@Override
	public Contact get(String element) {
		for (Contact contact : contacts) {
			if (contact != null)
				if (contact.getName().equals(element))
					return contact;

		}
		throw new NoSuchElementException("No element found");
	}

	public void display() {
		for (Contact contact : contacts) {
			if (contact != null) {
				System.out.println(contact);
			}
		}
	}
}
