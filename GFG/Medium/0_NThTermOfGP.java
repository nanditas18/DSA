/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/series-gp4646/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int nthTerm(int a, int r, int n) {
		int MOD = 1000000007;
		long result = 1;
		long base = r;
		int exponent = n - 1;
		while (exponent > 0) {
			if (exponent % 2 == 1) {
				result = (result * base) % MOD;
			}
			base = (base * base) % MOD;
			exponent /= 2;
		}
		result = (result * a) % MOD;
		return (int) result;
	}
}

