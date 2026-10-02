/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid0522/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int[] find(int l, int b, int h) {
		int[] ans = new int[2];
		ans[0] = (2*(l*b + b*h + h*l));
		ans[1] = (l*b*h);
		return ans;
	}
};

