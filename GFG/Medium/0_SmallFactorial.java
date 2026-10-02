/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/small-factorial0854/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public long find_fact(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}

