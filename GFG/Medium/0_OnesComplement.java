/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/ones-complement5928/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int onesComplement(int n) {
		int bits = (int)(Math.log(n) / Math.log(2));
		bits++;
		int num = (int)(Math.pow(2, bits));
		return n ^ (num - 1);
	}
}

