/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int sumOfMatrix(int[][] mat) {
		int res = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0 ; j < mat[i].length; j++) {
				res += mat[i][j];
			}
		}
		return res;
	}
}
