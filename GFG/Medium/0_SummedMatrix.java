/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/summed-matrix5834/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int sumMatrix(int n, int q) {
		if (q < 2 || q > 2 * n) {
			return 0;
		}
		return Math.min(q - 1, 2 * n - q + 1);
	}
}

