/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author aariv
 *
 */
public class FruitShopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FruitShop fruitShop = new FruitShop(5);

		fruitShop.add(new Fruits("Apple", 3));
		fruitShop.add(new Fruits("Orange", 2));
		fruitShop.add(new Fruits("Pinapple", 3));
		fruitShop.add(new Fruits("Banana", 5));

		System.out.println("Size: " + fruitShop.size());

		fruitShop.display();

		fruitShop.add(2, new Fruits("Grapes", 18));

		System.out.println("Size: " + fruitShop.size());

		fruitShop.add(2, new Fruits("Dg", 18));

		fruitShop.display();

		System.out.println("Size: " + fruitShop.size());

		fruitShop.remove(2);

		fruitShop.display();

		System.out.println("Size: " + fruitShop.size());

		fruitShop.remove(new Fruits("Pinapple", 3));

		fruitShop.display();

		System.out.println("Size: " + fruitShop.size());

		fruitShop.clear();

		System.out.println("Size: " + fruitShop.size());
		
		fruitShop.display();

	}

}
