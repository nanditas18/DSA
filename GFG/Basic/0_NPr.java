/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/npr4253/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public long nPr(int n, int r) {
		long ans = 1;
		for (int i = 0; i < r; i++)
			ans *= (n - i);
		return ans;
	}
}

