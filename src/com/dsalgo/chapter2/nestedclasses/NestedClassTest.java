/**
 * 
 */
package com.dsalgo.chapter2.nestedclasses;

/**
 * @author aariv
 *
 */
public class NestedClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CCard.Transaction transaction = new CCard.Transaction();
		transaction.test();
	}

}

class CCard {

	static class Transaction {
		public void test() {
			System.out.println("Test............");
		}
	}

	// instance varialbe for credit card
	Transaction[] transactions;
}