/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/diagonal-sum0158/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		int n = mat.length;
		for (int i = 0; i<mat.length; i++) {
			sum += mat[i][i];
			sum += mat[i][n - 1 - i];
		}
		return sum;
	}
}

