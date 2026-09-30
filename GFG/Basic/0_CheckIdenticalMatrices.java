/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/identical-matrices1042/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public boolean identicalMat(int[][] a, int[][] b) {
		int n = a.length;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}

