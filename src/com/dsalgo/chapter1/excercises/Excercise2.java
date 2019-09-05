/**
 * 
 */
package com.dsalgo.chapter1.excercises;

/**
 * Suppose that we create an array A of GameEntry objects, which has an integer
 * scores field, and we clone A and store the result in an array B. If we then
 * im- mediately set A[4].score equal to 550, what is the score value of the
 * GameEntry object referenced by B[4]?
 * 
 * @author Ariv
 *
 */
public class Excercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameEntry[] gameEntryA = new GameEntry[3];
		gameEntryA[0] = new GameEntry(12);
		gameEntryA[1] = new GameEntry(13);
		gameEntryA[2] = new GameEntry(14);

		// Clone the array
		GameEntry[] gameEntryB = new GameEntry[3];

		gameEntryB = gameEntryA.clone();

		gameEntryA[2].score = 550;

		/**
		 * GameEntry from A: 25 
		 * GameEntry from B: 25
		 * 
		 */
		System.out.println("GameEntry from A: " + gameEntryA[2].score);
		System.out.println("GameEntry from B: " + gameEntryB[2].score);
	}

}

class GameEntry {
	int score;

	GameEntry(int score) {
		this.score = score;
	}
}
