/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author aariv
 *
 */
public class FruitShop implements BaseOperations<Fruits> {

	private int size;

	private Fruits[] fruits;

	private final static int CAPACITY = 10;

	public FruitShop(int capacity) {
		fruits = new Fruits[capacity];
	}

	@Override
	public void add(Fruits item) {
		int n = fruits.length;
		if (size < n)
			size++;
		int insertPosition = size - 1;
		fruits[insertPosition] = item;
	}

	@Override
	public void add(int position, Fruits item) {
		int n = fruits.length;
		if (position < 0 || position >= size)
			throw new IndexOutOfBoundsException("Invalid index" + position);
		int j = n - 1;
		for (; j > position; j--) {
			fruits[j] = fruits[j - 1];
		}
		fruits[position] = item;
		if (size < n)
			size++;
	}

	@Override
	public void remove(Fruits item) {
		int deletedPosition = 0;
		for (int i = 0; i < fruits.length; i++) {
			if (item.equals(fruits[i])) {
				deletedPosition = i;
				break;
			}
		}
		remove(deletedPosition);
	}

	@Override
	public void clear() {
		fruits = new Fruits[CAPACITY];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	public void display() {
		if (size <= 0)
			System.out.println("No elements found.");
		for (Fruits fruits : fruits) {
			if (fruits != null) {
				System.out.println(fruits);
			}
		}
	}

	public Fruits[] getFruits() {
		return fruits;
	}

	@Override
	public void remove(int i) {
		if (i < 0 || i >= size)
			throw new IndexOutOfBoundsException("Invalid index " + i);

		for (int j = i; j < size - 1; j++)
			fruits[j] = fruits[j + 1];

		fruits[size - 1] = null;
		size--;
	}

}
