/**
 * 
 */
package com.dsalgo.chapter2.exceptions;

/**
 * @author aariv
 *
 */
public class ExceptionTest {

	private static final int DEFAULT = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = DEFAULT;

		try {
			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				System.out.println("n must be positive. Using default");
				n = DEFAULT;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default");
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer argument. Using default");
		}
	}

}
