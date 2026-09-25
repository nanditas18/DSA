/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-ap-series4512/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int sumOfAP(int n, int a, int d) {
		int sum = (n * (2 * a + (n - 1) * d)) / 2;
		return sum;
	}
};

