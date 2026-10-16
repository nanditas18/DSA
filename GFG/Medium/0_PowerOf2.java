/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public boolean isPowerofTwo(int n) {
		if (n == 1 || n == 2)
			return true;
		for (int i = 2; i <= n; i *= 2) {
			
			if (i*2 == n)
				return true;
		}
		return false;
	}
}

