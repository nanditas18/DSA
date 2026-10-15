/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reversing-the-rows-of-a-matrix-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	void interchangeRows(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		for (int i = 0; i<n/2; i++) {
			for (int j = 0; j<m; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[n - 1-i][j];
				mat[n - 1-i][j] = temp;
			}
		}
	}
}

