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
package com.dsalgo.chapter8.generaltrees;

/**
 * @author zentere
 *
 */
public class BinarySearchTreeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree iList = new BinarySearchTree();
		TreeNode root = null;
		root = iList.insert(root, 12);
		root = iList.insert(root, 13);
		root = iList.insert(root, 14);
		root = iList.insert(root, 15);
	}

}

class BinarySearchTree {
	private TreeNode createNewNode(int e) {
		TreeNode newNode = new TreeNode();
		newNode.e = e;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

	public TreeNode insert(TreeNode node, int val) {
		if (node == null)
			return createNewNode(val);
		if (val < node.e) {
			node.left = insert(node.left, val);
		} else if (val > node.e) {
			node.right = insert(node.right, val);
		}
		return node;
	}
}

class TreeNode {
	Integer e;
	TreeNode left;
	TreeNode right;

}
