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
package com.dsalgo.chapter7.lists.excercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author zentere
 *
 */
public class Excercise3<E> implements Deque<E> {

	private int capacity = 16;

	private ArrayList<E> arrayList;

	public Excercise3() {
		arrayList = new ArrayList<>(capacity);
	}

	public Excercise3(int capacity) {
		this.capacity = capacity;
		arrayList = new ArrayList<>(capacity);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(E e) {
		if (size() == capacity)
			throw new IllegalStateException("Deque is full");
		arrayList.add(0, e);
	}

	@Override
	public void addLast(E e) {
		if (size() == 0)
			throw new IllegalStateException("Deque is full");
		arrayList.add(size(), e);
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		return null;
	}

	@Override
	public E getFirst() {
		if (arrayList.size() == 0)
			return null;
		return arrayList.get(0);
	}

	@Override
	public E getLast() {
		if (arrayList.size() == 0)
			return null;
		return arrayList.get(arrayList.size() - 1);
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeFirst() {
		if (arrayList.size() == 0)
			return null;
		return arrayList.remove(0);
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeLast() {
		if (arrayList.size() == 0)
			return null;
		return arrayList.remove(size() - 1);
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return arrayList.size();
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArrayListDeque [capacity=" + capacity + ", arrayList=" + arrayList + "]";
	}

	public static void main(String[] args) {
		Excercise3<Integer> iList = new Excercise3<>(5);
		
		iList.addFirst(12);
		iList.addLast(12);
		iList.addFirst(12);
		iList.addLast(12);
		iList.addFirst(12);
		iList.addLast(12);
		System.out.println(iList.size());
		System.out.println("First: " + iList.getFirst());
		System.out.println(iList.toString());
	}
}
