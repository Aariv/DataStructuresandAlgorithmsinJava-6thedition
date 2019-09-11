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
package com.dsalgo.chapter2.nestedclasses;

import com.dsalgo.chapter2.minheritance.Sellable;

/**
 * @author aariv
 * 
 * <T extends superClassName>
 *
 */
public class ShopingCart<T extends Sellable> {

	private T objRef;

	public ShopingCart() {
		// TODO Auto-generated constructor stub
	}

	public ShopingCart(T obj) {
		this.objRef = obj;
	}

	public void runTest() {
		System.out.println(this.objRef.description());
	}

	public static void main(String[] args) {
		ShopingCart<C> test = new ShopingCart<>(new C());
		test.runTest();
	}
}

class C implements Sellable {

	@Override
	public String description() {
		return "Description from C";
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}