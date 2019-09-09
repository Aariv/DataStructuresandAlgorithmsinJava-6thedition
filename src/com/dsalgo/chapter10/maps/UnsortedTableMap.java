/**
 * 
 */
package com.dsalgo.chapter10.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map.Entry;

/**
 * @author zentere
 *
 */
public class UnsortedTableMap<K, V> extends AbstractMap<K, V> {

	private ArrayList<MapEntry<K, V>> table = new ArrayList<>();

	public UnsortedTableMap() {
		// TODO Auto-generated constructor stub
	}

	private int findIndex(K key) {
		int n = table.size();
		for (int j = 0; j < n; j++)
			if (table.get(j).getKey().equals(key))
				return j;
		return -1;
	}

	@Override
	public int size() {
		return table.size();
	}

	@Override
	public V get(K key) {
		int j = findIndex(key);
		if (j == -1)
			return null;

		return table.get(j).getValue();
	}

	@Override
	public V put(K key, V value) {
		int j = findIndex(key);
		if (j == -1) {
			table.add(new MapEntry<>(key, value));
			return null;
		} else
			return table.get(j).setValue(value);

	}

	@Override
	public V remove(K key) {
		int j = findIndex(key);
		int n = size();
		if (j == -1)
			return null;
		V answer = table.get(j).getValue();
		if (j != n - 1)
			table.set(j, table.get(n - 1));

		table.remove(n - 1);
		return answer;
	}

	@Override
	public Iterable<K> keySet() {
		return null;
	}

	class EntryIterator implements Iterator<Entry<K, V>> {
		private int j = 0;

		@Override
		public Entry<K, V> next() {
			if (j == table.size())
				throw new NoSuchElementException();
			return table.get(j++);
		}

		@Override
		public boolean hasNext() {
			return j < table.size();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	class EntryIterable implements Iterable<Entry<K, V>> {

		@Override
		public Iterator<Entry<K, V>> iterator() {
			return new EntryIterator();
		}
		
	}

	public Iterable<Entry<K, V>> entrySet() {
		return new EntryIterable();
	}
}
