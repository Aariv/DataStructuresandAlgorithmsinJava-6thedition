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
package com.dsalgo.chapter8.generaltrees;

import java.util.Iterator;

import com.dsalgo.chapter7.positionlists.Position;

/**
 * @author zentere
 *
 */
public abstract class AbstractTree<E> implements Tree<E> {

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Position<E> root() {
		return null;
	}

	@Override
	public Position<E> parent(Position<E> p) {
		return null;
	}

	@Override
	public Iterable<Position<E>> children(Position<E> p) {
		return null;
	}

	@Override
	public int numChildren(Position<E> p) {
		return 0;
	}

}
