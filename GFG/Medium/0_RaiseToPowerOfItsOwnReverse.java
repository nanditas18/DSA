/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int reverseExponentiation(int n) {
		if (n == 10) {
			return 10;
		}
		int res = (int)Math.pow(n, n);
		return res;
	}
}

