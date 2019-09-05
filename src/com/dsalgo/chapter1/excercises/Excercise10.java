/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a Java class, Flower, that has three instance variables of type String,
 * int, and float, which respectively represent the name of the flower, its
 * number of petals, and price. Your class must include a constructor method
 * that initializes each variable to an appropriate value, and your class should
 * include methods for setting the value of each type, and getting the value of
 * each type.
 * 
 * @author ariv
 *
 */
public class Excercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower = new Flower();
		flower.setName("Jasmine");
		flower.setPetals(3);
		flower.setPrice(12f);

		System.out.println("Name: " + flower.getName());
		System.out.println("Petals: " + flower.getPetals());
		System.out.println("Price : " + flower.getPrice());
	}

}

class Flower {
	// instance variables
	private String name;
	private int petals;
	private float price;

	public Flower() {
		// TODO Auto-generated constructor stub
	}

	public Flower(String name, int petals, float price) {
		this.name = name;
		this.petals = petals;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPetals() {
		return petals;
	}

	public void setPetals(int petals) {
		this.petals = petals;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
