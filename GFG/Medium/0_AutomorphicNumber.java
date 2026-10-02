/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/automorphic-number4721/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public String isAutomorphic(int n) {
		int sq = n * n;
		int temp = n;
		int pow = 1;
		while (temp > 0) {
			pow *= 10;
			temp /= 10;
		}
		if (sq % pow == n) {
			return "Automorphic";
		}
		else {
			return "Not Automorphic";
		}
	}
}

