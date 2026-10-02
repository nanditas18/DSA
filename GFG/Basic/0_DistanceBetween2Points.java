/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/distance-between-2-points3200/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int distance(int x1, int y1, int x2, int y2) {
		int x = x1 - x2;
		int y = y1 - y2;
		int x_sq = x*x;
		int y_sq = y*y;
		int sum = (x_sq + y_sq);
		return (int) Math.round(Math.sqrt(sum));
	}
}

