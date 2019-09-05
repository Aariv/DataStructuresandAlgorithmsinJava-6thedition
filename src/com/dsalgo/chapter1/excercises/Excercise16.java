/**
 * 
 */
package com.dsalgo.chapter1.excercises;

import java.util.Scanner;

/**
 * Write a short program that takes as input three integers, a, b, and c, from
 * the Java console and determines if they can be used in a correct arithmetic
 * formula (in the given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 * 
 * @author ariv
 *
 */
public class Excercise16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		System.out.println("Enter c: ");
		int c = scanner.nextInt();

		// a + b = c;
		a = b - c; // this is the correct one
		if (determine(a, b, c))
			System.out.println("Can be used in arithmatic formula.");
		else 
			System.out.println("Can't be used in arithmatic formula.");
	}

	/**
	 * 
	 * Ex a = 8, b = 32, c = 4
	 * 
	 * a + b == c => 8 + 32 == 4 - False
	 * b + c == a => 32 + 4 == 8 - False
	 * a + c == b => 8 + 4 == 32 - False
	 * 
	 * a * b == c => 8 * 32 = 226 = 4 ==>  False
	 * b * c == a => 32 * 4 = 128 = 8 ==>  False
	 * a * c == b => 8 * 4 == 32 = 32 ==>  True
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean determine(int a, int b, int c) {
		if (a + b == c)
			return true;
		else if (b + c == a)
			return true;
		else if (a + c == b)
			return true;
		else if (a * b == c)
			return true;
		else if (b * c == a)
			return true;
		else if (a * c == b)
			return true;

		return false;

	}
}
