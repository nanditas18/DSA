/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	int minRow(int mat[][]) {
		int n = mat.length;
		int m = mat[0].length;
		int minOnes = Integer.MAX_VALUE;
		int rowindex = 0;
		for (int i = 0; i<n; i++) {
			int count = 0;
			for (int j = 0; j<m; j++) {
				if (mat[i][j] == 1) {
					count++;
				}
			}
			if (count<minOnes) {
				minOnes = count;
				rowindex = i;
			}
		}
		return rowindex + 1;
	}
};

