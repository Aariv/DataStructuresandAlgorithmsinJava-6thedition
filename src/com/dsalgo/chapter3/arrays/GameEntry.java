/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author aariv
 *
 */
public class GameEntry {

	// instance variables
	private String name; // name of the person who is earning the score.

	private int score; // the score value

	/*
	 * Constructs a game entry with given parameters
	 */
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}

	/*
	 * Returns the name field.
	 */
	public String getName() {
		return name;
	}

	/*
	 * Returns the score field
	 */
	public int getScore() {
		return score;
	}

	/*
	 * Returns a string representation of this entry. (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}
