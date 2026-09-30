/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public boolean sumOfRowCol(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int range = Math.min(n, m);
		for (int i = 0; i<range; i++) {
			int row_sum = 0;
			int col_sum = 0;
			for (int col = 0; col<m; col++) {
				row_sum += mat[i][col];
			}
			for (int row = 0; row<n; row++) {
				col_sum += mat[row][i];
				
			}
			if (row_sum != col_sum) {
				return false;
			}
		}
		return true;
	}
}

