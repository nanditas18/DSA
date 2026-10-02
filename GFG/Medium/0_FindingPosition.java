/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/finding-position2223/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static long nthPosition(long n) {
		long position = 1;
		while (position <= n) {
			position *= 2;
		}
		return position / 2;
	}
}

