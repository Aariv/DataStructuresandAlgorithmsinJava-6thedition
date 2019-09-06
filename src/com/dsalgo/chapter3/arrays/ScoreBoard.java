/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author zentere
 *
 */
public class ScoreBoard {
	private int numEntries = 0;

	private GameEntry[] board;

	public ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}

	/**
	 * Attempt to add new score to the collection
	 */
	public void add(GameEntry e) {
		int newScore = e.getScore();
		int n = board.length;
		// is new entry high score
		if (numEntries < n || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < n)
				numEntries++; // overall number increases

			int j = numEntries - 1;
			// is new entry score high?
			while (j > 0 && board[j - 1].getScore() < newScore) {
				// make space for new entry
				board[j] = board[j - 1]; // shift entry from j - 1 to j
				j--; // and decrement j
			}

			board[j] = e; // when done add new entry
		}
	}

	/**
	 * Remove an entry
	 * 
	 * @param i
	 */
	public GameEntry remove(int i) {
		if (i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Invalid index " + i);

		GameEntry temp = board[i]; // save the object to be removed

		for (int j = i; j < numEntries - 1; j++) // count up from i (not down)
			board[j] = board[j + 1]; // move one cell to the left.

		board[numEntries - 1] = null; // null out the old last score
		numEntries--;
		return temp; // return the removed object.
	}

	public void displayDetails() {
		for (GameEntry gameEntry : board) {
			if (gameEntry != null) {
				System.out.println(gameEntry);
				System.out.println("============================");
			}
		}
	}

	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard(10);

		scoreBoard.add(new GameEntry("Jack", 510));
		scoreBoard.add(new GameEntry("Mike", 1105));
		scoreBoard.add(new GameEntry("Rose", 590));
		scoreBoard.add(new GameEntry("Rob", 750));
		scoreBoard.add(new GameEntry("Paul", 720));
		scoreBoard.add(new GameEntry("Anna", 660));

		scoreBoard.displayDetails();

		System.out.println("========== Initial values ends =====");

		System.out.println("Insert Selva 800 Score");

		scoreBoard.add(new GameEntry("Selva", 800));

		scoreBoard.displayDetails();

		System.out.println("Remove Anna");
		scoreBoard.remove(4);
		scoreBoard.displayDetails();

	}
}
