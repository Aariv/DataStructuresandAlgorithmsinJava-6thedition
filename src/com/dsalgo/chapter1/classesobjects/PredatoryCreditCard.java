/**
 * 
 */
package com.dsalgo.chapter1.classesobjects;

/**
 * @author zentere
 *
 */
public class PredatoryCreditCard extends CreditCard {

	// additional instance variable

	private double apr;

	public PredatoryCreditCard() {
		// TODO Auto-generated constructor stub
	}

	public PredatoryCreditCard(String cust, String bk, String acnt, int lmt, double bal, double rate) {
		super(cust, bk, acnt, lmt, bal);
		apr = rate;
	}

	public void processMonth() {
		if (balance > 0) {
			double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);

			balance *= monthlyFactor;
		}
	}

	@Override
	public boolean charge(double price) {
		boolean isSuccess = super.charge(price);
		if (!isSuccess)
			balance += 5;
		return isSuccess;
	}
}
