/*
 * Copyright 2019, Arivazhagan L.
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package com.dsalgo.chapter3.arrays.random;

/**
 * @author zentere
 * 
 *         It is not complete solution. Aariv, you have to work it out.
 *
 */
public class CryptoScience {

	public static void main(String[] args) {
		int j = 0;
		char c = 'B';
		System.out.println(c);
		j = 'T' - 'A'; // 84 - 65
		System.out.println(j);

		CeasorCipher ceasorCipher = new CeasorCipher(3);
		System.out.println("Encryption Code: " + new String(ceasorCipher.encoder));
		System.out.println("Decryption Code: " + new String(ceasorCipher.decoder));
		String message = "HI EVERYONE";
		String coded = ceasorCipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = ceasorCipher.decrypt(message);
		System.out.println("Message: " + answer);
	}
}

class CeasorCipher {

	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];

	/*
	 * Constructs for doing encryption and decryption using CeasorCipher
	 */
	public CeasorCipher(int rotation) {
		for (int k = 0; k < 26; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % 26);
			decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
		}
	}

	public String encrypt(String message) {
		return transform(message, encoder);
	}

	public String decrypt(String message) {
		return transform(message, decoder);
	}

	private String transform(String original, char[] code) {
		char msg[] = original.toCharArray();
		for (int k = 0; k < msg.length; k++) {
			if (Character.isUpperCase(msg[k])) {
				int j = msg[k] - 'A';
				msg[k] = code[j];
			}
		}
		return new String(msg);
	}
}