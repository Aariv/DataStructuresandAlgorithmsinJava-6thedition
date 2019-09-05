/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a pseudocode description of a method that reverses an array of n
 * integers, so that the numbers are listed in the opposite order than they were
 * before, and compare this method to an equivalent Java method for doing the
 * same thing.
 * 
 * @author ariv
 *
 */
public class Excercise14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int start = 0;
		int end = nums.length - 1;
		reverseArray(nums, start, end);
	}

	/**
	 * Ex: nums = [1, 2, 3, 4]
	 * 
	 * iter = 0, start = 0, end = 3, swap(nums[0], nums[3])
	 * 						temp = 1, nums[0] = nums[3], nums[3] = temp(1); => nums[4, 2, 3, 1]
	 * 
	 * iter = 1, start = 1, end = 2, swap(nums[1], nums[2])
	 * 						temp = 2, nums[1] = nums[2], nums[2] = temp(2) => nums[4, 3, 2, 1]
	 * 
	 * iter = 2, start = 2, end = 1 (loop terminated)
	 * 						
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 */
	private static void reverseArray(int[] nums, int start, int end) {
		int temp = 0;
		while (start < end) {
			// used to store the element to swap 
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			// increase the position index by 1
			start++;
			// decrease the end position index by 1
			end--;
		}
	}

}
