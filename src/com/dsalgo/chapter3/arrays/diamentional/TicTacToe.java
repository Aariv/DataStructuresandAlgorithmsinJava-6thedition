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
package com.dsalgo.chapter3.arrays.diamentional;

/**
 * @author aariv
 *
 */
public class TicTacToe {

	public static final int X = 1, O = -1;
	public static final int EMPTY = 0;
	private int board[][] = new int[3][3];

	private int player;

	public TicTacToe() {
		clearBoard();
	}

	private void clearBoard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[j][j] = EMPTY;
		player = X; // first player is X
	}

	public void putMark(int i, int j) throws IllegalArgumentException {
		if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
			throw new IllegalArgumentException("Invalid board position");
		if (board[i][j] != EMPTY)
			throw new IllegalArgumentException("Board position occupied");
		board[i][j] = player; // place the mark for the current player.
		player = -player; // switch players
	}

	public boolean isWin(int mark) {
		return ((board[0][0] + board[0][1] + board[0][2] == mark * 3
				|| board[1][0] + board[1][1] + board[1][2] == mark * 3
				|| board[2][0] + board[2][1] + board[2][2] == mark * 3)

				|| board[0][0] + board[1][0] + board[2][0] == mark * 3
				|| board[0][1] + board[1][1] + board[2][1] == mark * 3
				|| board[0][2] + board[1][2] + board[2][2] == mark * 3

				|| board[0][0] + board[1][1] + board[2][2] == mark * 3
				|| board[2][0] + board[1][1] + board[0][2] == mark * 3);
	}

	public int winner() {
		if (isWin(X))
			return (X);
		else if (isWin(O))
			return (O);
		else
			return (O);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
				case X:
					sb.append("X");

					break;
				case O:
					sb.append("O");
				case EMPTY:
					sb.append(" ");
					break;
				}
				if (j < 2)
					sb.append("|");
			}
			if (i < 2)
				sb.append("\n-------\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.putMark(1, 1);	ticTacToe.putMark(0, 2);
		ticTacToe.putMark(2, 2);	ticTacToe.putMark(0, 0);
		
		ticTacToe.putMark(0, 1);	ticTacToe.putMark(2, 1);
		ticTacToe.putMark(1, 2);	ticTacToe.putMark(1, 0);
		
		ticTacToe.putMark(2, 0);
		
		System.out.println(ticTacToe);
		
		int winnerPlayer = ticTacToe.winner();
		String[] outcome = {"O wins", "Tie", "X wins"};
		System.out.println(outcome[1 + winnerPlayer]);
		
		
	}
}
