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
public class Book implements BookReadOnly {
	private int id;

	private String title;
	private String author;
	private Price price;

	public Book(int id, String title, String author, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	// TODO it is mutable
	/* (non-Javadoc)
	 * @see com.dsalgo.chapter15.memory.BookReadOnly#getPrice()
	 */
	@Override
	public Price getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see com.dsalgo.chapter15.memory.BookReadOnly#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.dsalgo.chapter15.memory.BookReadOnly#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.dsalgo.chapter15.memory.BookReadOnly#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}

}
