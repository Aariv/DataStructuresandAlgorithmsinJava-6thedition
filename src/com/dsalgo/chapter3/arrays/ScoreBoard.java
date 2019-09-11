/**
 * 
 */
package com.dsalgo.chapter3.arrays;

/**
 * @author aariv
 * 
 *         Class for storing high scores in an array in nondecreasing order
 *
 */
public class ScoreBoard {
	private int numEntries = 0; // number of actual entries

	private GameEntry[] board; // array of game entries(names & scores)

	/*
	 * Constructs an empty scoreboard with the given capacity for storing entries
	 */
	public ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}

	/**
	 * Attempt to add new score to the collection if it is high enough
	 */
	public void add(GameEntry e) {
		int newScore = e.getScore();
		int n = board.length;
		// is new entry high score
		if (numEntries < n || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < n) // no score drops from the board
				numEntries++; // overall number increases
			// shift any lower scores rightward to make room for the new entry
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
	 * Remove an entry and return high score at index i.
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

		// scoreBoard.add(new GameEntry("Mike", 1105));
		// scoreBoard.add(new GameEntry("Rose", 590));
		// scoreBoard.add(new GameEntry("Rob", 750));
		// scoreBoard.add(new GameEntry("Paul", 720));
		// scoreBoard.add(new GameEntry("Anna", 660));
		long startTimeAdd = System.currentTimeMillis();
		for (int i = 1; i <= 10000000; i++) {
			scoreBoard.add(new GameEntry("Jack" + i, i));
		}
		long endTimeAdd = System.currentTimeMillis();
		long elapsedAdd = endTimeAdd - startTimeAdd;
		System.out.println("Time taken to add: " + elapsedAdd);

		// System.out.println("========== Initial values ends =====");
		//
		// System.out.println("Insert Selva 800 Score");
		//
		// scoreBoard.add(new GameEntry("Selva", 800));
		//
		// scoreBoard.displayDetails();
		//
		// System.out.println("Remove Anna");
		// scoreBoard.remove(4);
		long startTime = System.currentTimeMillis();
		scoreBoard.displayDetails();
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("Time taken to display: " + elapsed);
	}
}
