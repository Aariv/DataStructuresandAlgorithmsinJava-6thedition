/**
 * 
 */
package com.dsalgo.chapter2.minheritance;

/**
 * @author zentere
 *
 */
public class Photograph implements Sellable {

	private String description;
	private int price;
	private boolean color;

	public Photograph(String desc, int price, boolean color) {
		this.description = desc;
		this.price = price;
		this.color = color;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price / 2;
	}

	public boolean isColor() {
		return color;
	}
}
