/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all
 * the punctuation from a string s storing a sentence, for example, transforming
 * the string "Let’s try, Mike!" to "Lets try Mike".
 * 
 * @author ariv
 *
 */
public class Excercise9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeAllPunctuation(new StringBuilder("Let's try, Mike!")));
	}

	/**
	 * 
	 * @param stringBuilder
	 */
	public static String removeAllPunctuation(StringBuilder stringBuilder) {
		// delete special chars from string
		for (int i = 0; i < stringBuilder.length(); i++) {
			char ch = stringBuilder.charAt(i);
			if (ch == ',' || ch == '\'' || ch == '!') {
				stringBuilder.deleteCharAt(i);
			}
		}
		return stringBuilder.toString();
	}
}
