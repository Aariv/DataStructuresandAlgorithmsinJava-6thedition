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

import java.util.ArrayList;
import java.util.List;

/**
 * @author zentere
 *
 */
public class BookCollection {

	private List<Book> books;

	public BookCollection() {
		books = new ArrayList<>(20);
		books.add(new Book(1, "Book 1", "Author 1", 5.99));
		books.add(new Book(2, "Book 2", "Author 2", 13.99));
		books.add(new Book(3, "Book 3", "Author 3", 34.99));
		books.add(new Book(4, "Book 4", "Author 4", 12.99));
		books.add(new Book(5, "Book 5", "Author 5", 9.99));
		books.add(new Book(6, "Book 6", "Author 6", 5.99));
		books.add(new Book(7, "Book 7", "Author 7", 7.99));
		books.add(new Book(8, "Book 8", "Author 8", 2.99));
		books.add(new Book(9, "Book 9", "Author 9", 4.99));
	}

	public Book findBookByName(String name) {
		for (Book book : books) {
			if (book.getTitle().equals(name))
				return book;

		}
		return null;
	}

	public void printAllBooks() {
		for (Book book : books) {
			System.out.println(book.getTitle() + ":" + book.getPrice());
		}
	}
}
