/**
 * 
 */
package com.dsalgo.chapter1.classesobjects;

/**
 * 
 * A simple model for a consumer credit card.
 * 
 * @author Ariv
 *
 */
public class CreditCard {

	// instance variables

	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;

	// constructors
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a new credit card instance
	 * 
	 * @param cust
	 *            the name of the customer(e.g., "Arivazhagan")
	 * @param bk
	 *            the name of the bank(e.g., "State Bank of India")
	 * @param acnt
	 *            the account identifier (e.g., "5050505050")
	 * @param lmt
	 *            the credit limit(mesasured in rupees)
	 * @param bal
	 *            the initial balance (measured in rupees)
	 */
	public CreditCard(String cust, String bk, String acnt, int lmt, double bal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lmt;
		balance = bal;
	}

	public CreditCard(String cust, String bk, String acnt, int lmt) {
		this(cust, bk, acnt, lmt, 0.0); // use 0 balance by default
	}

	// Accessor methods
	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}

	// update method
	/**
	 * Charges the given price to the card, assuming sufficient credit limit
	 * 
	 * @param price
	 *            the amount to be charged
	 * @return if the charge was accepted return true else false
	 */
	public boolean charge(double price) {
		if (price + balance > limit) // if hte balance is beyond the limit return false
			return false;
		balance += price;
		return true;
	}

	/**
	 * Process customer payment that reduces the amount
	 * 
	 * @param amount
	 *            the amount of payment made
	 */
	public void makePayment(double amount) {
		// ignore if amount is greater than the balance amount
		if (balance >= amount) {
			balance -= amount;
		}

	}

	public void updateCreditCardLimit(int limit) {
		this.limit = limit;
	}

	// Utility method to print
	public static void printSummary(CreditCard card) {
		System.out.println("Customer : " + card.getCustomer());
		System.out.println("Bank : " + card.getBank());
		System.out.println("Account : " + card.getAccount());
		System.out.println("Limit: " + card.getLimit());
		System.out.println("Balance: " + card.getBalance());
	}
}
