/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/fibonacci-using-recursion/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int nthFibonacci(int n) {
		int a = 0;
		int b = 1;
		for (int i = 0; i<n; i++) {
			int next = a + b;
			a = b;
			b = next;
		}
		return a;
	}
}

