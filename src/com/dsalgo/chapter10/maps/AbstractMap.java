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
package com.dsalgo.chapter10.maps;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author aariv
 *
 */
public abstract class AbstractMap<K, V> implements Map<K, V> {

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	protected static class MapEntry<K, V> implements Entry<K, V> {

		private K k;
		private V v;

		public MapEntry(K key, V value) {
			k = key;
			v = value;
		}

		@Override
		public K getKey() {
			return k;
		}

		@Override
		public V getValue() {
			return v;
		}

		@Override
		public V setValue(V value) {
			V old = v;
			v = value;
			return old;
		}

	}

	class KeyIterator implements Iterator<K> {

		private Iterator<Entry<K, V>> entries = entrySet().iterator();

		@Override
		public boolean hasNext() {
			return entries.hasNext();
		}

		@Override
		public K next() {
			return entries.next().getKey();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	class KeyIterable implements Iterable<K> {

		@Override
		public Iterator<K> iterator() {
			return new KeyIterator();
		}

	}

	class ValueIterator implements Iterator<V> {

		private Iterator<Entry<K, V>> entries = entrySet().iterator();

		@Override
		public boolean hasNext() {
			return entries.hasNext();
		}

		@Override
		public V next() {
			return entries.next().getValue();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	class ValueIterable implements Iterable<V> {

		@Override
		public Iterator<V> iterator() {
			return new ValueIterator();
		}

	}

	public Iterable<V> values() {
		return new ValueIterable();
	}

}