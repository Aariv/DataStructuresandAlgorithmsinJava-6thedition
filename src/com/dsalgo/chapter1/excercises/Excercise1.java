/**
 * 
 */
package com.dsalgo.chapter1.excercises;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * Write a short Java method, inputAllBaseTypes, that inputs a different value
 * of each base type from the standard input device and prints it back to the
 * standard output device.
 * 
 * @author Ariv
 *
 */
public class Excercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		inputAllBaseTypes(number);

	}

	/**
	 * 
	 * @param obj
	 */
	public static void inputAllBaseTypes(Object obj) {
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.println(obj);
		printWriter.close();
	}
}
