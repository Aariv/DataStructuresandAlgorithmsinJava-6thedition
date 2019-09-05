/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * 
 * Write a short Java method that counts the number of vowels in a given
 * character string.
 * 
 * @author ariv
 *
 */
public class Excercise8 {

	public static void main(String[] args) {
		System.out.println(countVowels("Ariv"));
	}

	public static int countVowels(String s) {
		int vowels = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				vowels++;
			}

		}
		return vowels;
	}
}
