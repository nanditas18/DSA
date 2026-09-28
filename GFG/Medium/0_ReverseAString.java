/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}

