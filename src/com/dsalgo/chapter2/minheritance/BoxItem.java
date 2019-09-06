/**
 * 
 */
package com.dsalgo.chapter2.minheritance;

/**
 * @author zentere
 *
 */
public class BoxItem implements Sellable, Transportable {

	private String description;
	private int price;
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int depth = 0;

	public BoxItem(String description, int p, int w, boolean h) {
		this.description = description;
		price = p;
		weight = w;
		haz = h;
	}

	@Override
	public int weight() {
		return weight;
	}

	@Override
	public boolean isHazardous() {
		return haz;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public int listPrice() {
		return price;
	}

	@Override
	public int lowestPrice() {
		return price / 2;
	}

	public int insuredValue() {
		return price * 2;
	}

	public void setBox(int h, int w, int d) {
		height = h;
		width = w;
		depth = d;
	}
}
