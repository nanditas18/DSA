/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/geek-and-coffee-shop5721/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int mthHalf(int N, int M) {
		int ans = N;
		for (int i = 1; i < M; i++)
			{
			ans /= 2;
			if (ans == 0)
				return 0;
		}
		return ans;
	}
}

