/**
 * 
 */
package com.dsalgo.chapter1.classesobjects;

/**
 * @author aariv
 *
 */
public class CreditCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];

		wallet[0] = new CreditCard("Ariv", "SBI", "50505050505", 5000);
		wallet[1] = new CreditCard("Jayraj", "NOTA", "50505050506", 5000);
		wallet[2] = new CreditCard("Selva", "NB", "50505050507", 5000);

		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3 * val);
			wallet[1].charge(2 * val);
			wallet[2].charge(val);
		}

		for (CreditCard card : wallet) {
			CreditCard.printSummary(card); // calling static method
			System.out.println("==================================");
			while (card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("Customer: " + card.getCustomer() + " New Balance: " + card.getBalance());
			}

		}
	}

}
