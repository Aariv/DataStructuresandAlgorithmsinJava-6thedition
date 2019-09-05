/**
 * 
 */
package com.dsalgo.chapter2.inheritance;

/**
 * @author zentere
 *
 */
public class TestProgression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression progression;
		int n = 10;
		// test arithmatic progression
		/**System.out.println("Arithmatic progression with default increment");
		progression = new ArithmaticProgression();
		progression.printProgression(n);

		System.out.println("Arithmatic progression with increment 5");
		progression = new ArithmaticProgression(5);
		progression.printProgression(n);

		System.out.println("Arithmatic progression with start 2");
		progression = new ArithmaticProgression(5, 2);
		progression.printProgression(n); */
		
		System.out.println("===================================");
		
//		progression = new GeometricProgression();
//		progression.printProgression(n);
		System.out.println("Geometric progression with base 3");
		progression = new GeometricProgression(3);
		progression.printProgression(n);
		
		
	}

}
