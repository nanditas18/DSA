/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-the-kth-digit3520/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	static long kthDigit(int a, int b, int k) {
		long s = (long)Math.pow(a, b);
		long rem = 0;
		while (k>0) {
			rem = s%10;
			s /= 10;
			k--;
		}
		return rem;
	}
}

