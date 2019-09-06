/**
 * 
 */
package com.dsalgo.chapter2.generics;

/**
 * @author zentere
 *
 */
public class GenericsTest {

	public static void main(String[] args) {
		Pair<String, Integer> bid = new Pair<String, Integer>();

		bid.first = "First";
		bid.second = 30;

		System.out.println(bid.getFirst());
		System.out.println(bid.getSecond());

		bid = new Pair<>("COAL", 23);
	}

	public static <T> void reverse(T[] data) {
		int low = 0, high = data.length - 1;

		while (low < high) {
			T temp = data[low];
			data[low++] = data[high];
			data[high--] = temp;
		}
	}
}
