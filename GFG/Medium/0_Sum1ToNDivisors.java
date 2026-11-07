/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public static long sumOfDivisors(long n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
		}
		return sum;
	}
}

