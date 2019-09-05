/**
 * 
 */
package com.dsalgo.chapter1.excercises;

import com.dsalgo.chapter1.classesobjects.CreditCard;

/**
 * Modify the CreditCard class from Code Fragment 1.5 to include a method that
 * updates the credit limit.
 * 
 * @author ariv
 *
 */
public class Excercise11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// updated in CreditCard class
		CreditCard creditCard = new  CreditCard();
		creditCard.updateCreditCardLimit(100000);
	}

}
