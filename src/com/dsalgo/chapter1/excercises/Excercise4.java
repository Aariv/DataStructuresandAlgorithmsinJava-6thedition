/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * 
 * Write a short Java method, isEven, that takes an int i and returns true if
 * and only if i is even. Your method cannot use the multiplication, modulus, or
 * division operators, however.
 * 
 * @author Ariv
 *
 */
public class Excercise4 {

	public static void main(String[] args) {
		boolean result = isEven(7);
		if (result)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isEven(int n) {
		boolean isEven = true;
		for (int i = 1; i <= n; i++) {
			isEven = !isEven;
		}
		return isEven;
	}

	/**
	 * Use loop to decrease ith value by -2 at each iteration. if value reaches 0 then it is even.
	 * 
	 * Ex: 5
	 * 
	 * i = 1; i = i - 2 => 5 - 2 = 3
	 * i = 2; i = i - 2 => 3 - 2 = 1;
	 * i = 3; i = i - 2 => 1 - 2 = -1 exit the loop and print it is odd
	 * 
	 * ---------------------
	 * 
	 * Ex 4
	 * 
	 * i = 1; i = i - 2 => 4 - 2 = 2;
	 * i = 2; i = i - 2 => 2 - 2 = 0 return true it is even.
	 * 
	 * @param i
	 * @return
	 */
	public static boolean isEvenNumber(int i) {
		while (i > 0) {
			i = i - 2;

			if (i == 0)
				return true;
		}
		return false;
	}
}
