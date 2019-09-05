/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * A common punishment for school children is to write out a sentence multiple
 * times. Write a Java stand-alone program that will write out the following
 * sen- tence one hundred times: “I will never spam my friends again.” Your
 * program should number each of the sentences and it should make eight
 * different random- looking typos.
 * 
 * @author ariv
 *
 */
public class Excercise28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println("I will never spam my friends again." + i);
		}
	}

}
