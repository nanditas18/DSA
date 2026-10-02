/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/nth-even-fibonacci-number1119/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int nthEvenFibonacci(int n) {
		if (n == 1) {
			return 2;
		}
		if (n == 2) {
			return 8;
		}
		int a = 2;
		int b = 8;
		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = 4 * b + a;
			a = b;
			b = c;
		}
		
		return b;
	}
}

