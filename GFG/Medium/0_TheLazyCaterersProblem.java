/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/the-lazy-caterers-problem2527/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int maxCuts(int n) {
		return 1 + (n*(n + 1))/2;
	}
}

