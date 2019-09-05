/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a pseudocode description of a method for finding the smallest and
 * largest numbers in an array of integers and compare that to a Java method
 * that would do the same thing.
 * 
 * @author ariv
 *
 */
public class Excercise15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * PseduoCode for findind smalleset and largest numbers;
		 * 
		 * READ array a[10]
		 * 
		 * MAX = a[0]
		 * MIN = a[0]
		 * 
		 * FOR EACH element LOOP UNTIL N - 1;
		 * 	IF(a[i] > MAX)
		 * 		UPDATE MAX = a[i]
		 *  IF(a[i] < MIN) 
		 *  	UPDATE MIN = a[i]
		 * 
		 */
		
		int a[] = { 10, 11, 12, 13, 15, 16 };
		
		int min = a[0];
		int max = a[1];
		
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		
		System.out.println("Minimum Value: " + min);
		System.out.println("Maximum Value: " + max);
		
		/**
		 * Minimum Value: 10 
		 * Maximum Value: 16
		 * 
		 */
	}

}
