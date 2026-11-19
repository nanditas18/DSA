/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-total-digits-in-a-number/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int countDigits(int n) {
		int count = 1;
		while (n/10 != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
}

