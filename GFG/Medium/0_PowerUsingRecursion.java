/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-using-recursion/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int recursivePower(int n, int p) {
		if (p == 0) {
			return 1;
		}
		return n*recursivePower(n, p - 1);
	}
}
