/**
 * 
 */
package com.dsalgo.chapter4.analysis;

/**
 * @author zentere
 *
 */
public class TimeElapseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		repeat1('a', 5000);
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("Time taken " + elapsed);
	}

	public static String repeat1(char c, int n) {
		String answer = "";
		for (int j = 0; j < n; j++)
			answer += c;
		return answer;
	}

	public static String repeat2(char c, int n) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++)
			sb.append(c);
		return sb.toString();
	}
}
