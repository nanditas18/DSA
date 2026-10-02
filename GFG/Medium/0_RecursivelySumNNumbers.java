/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/recursively-sum-n-numbers/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int recursiveSum(int n) {
		if (n == 0) {
			return 0;
		}
		int sum = recursiveSum(n - 1);
		int s = n + sum;
		return s;
	}
}

