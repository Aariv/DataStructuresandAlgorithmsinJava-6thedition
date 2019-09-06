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

		// is new entry high score
		if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length)
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

	public void display(GameEntry gameEntry) {
		System.out.println("Name: " + gameEntry.getName());
		System.out.println("Score: " + gameEntry.getScore());
	}

	public void displayDetails() {
		for (GameEntry gameEntry : board) {
			if (gameEntry != null) {
				display(gameEntry);
				System.out.println("============================");
			}
		}
	}

	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard(10);

		scoreBoard.add(new GameEntry("Mike", 1105));
		scoreBoard.add(new GameEntry("Rob", 750));
		scoreBoard.add(new GameEntry("Paul", 720));
		scoreBoard.add(new GameEntry("Anna", 660));
		scoreBoard.add(new GameEntry("Rose", 590));
		scoreBoard.add(new GameEntry("Jack", 510));

		scoreBoard.displayDetails();
		
		System.out.println("========== Initial values ends =====");
		
		System.out.println("Insert Selva 800 Score");

		scoreBoard.add(new GameEntry("Selva", 800));

		scoreBoard.displayDetails();
	}
}
