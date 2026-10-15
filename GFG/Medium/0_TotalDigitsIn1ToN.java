/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/total-digits4030/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int totalDigits(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += String.valueOf(i).length();
		}
		return total;
	}
}

