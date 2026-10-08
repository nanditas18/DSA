/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/equal-sum-and-xor/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int countValues(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++)
			{
			if (n + i == (n^i))
				count++;
		}
		return count;
	}
}

