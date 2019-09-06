/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author zentere
 *
 */
public class Contact {

	private String name;
	private String phoneNumber;
	private String countryCode;
	private String nationality;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phoneNumber, String countryCode, String nationality) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.countryCode = countryCode;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getNationality() {
		return nationality;
	}

	public String toString() {
		return "[" + name + ":" + phoneNumber + "]";
	}
}
