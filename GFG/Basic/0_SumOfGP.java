/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-gp2120/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int sumOfGP(int n, int a, int r) {
		int r_terms = 0;
		for (int i = 0; i<n; i++) {
			r_terms += Math.pow(r, i);
		}
		return (a*r_terms);
	}
}

