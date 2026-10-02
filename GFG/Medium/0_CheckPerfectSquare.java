/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-perfect-square5253/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public boolean isPerfectSquare(int n) {
		int a = (int)Math.sqrt(n);
		if (a*a == n){
			return true;
		}
		return false;
	}
}

