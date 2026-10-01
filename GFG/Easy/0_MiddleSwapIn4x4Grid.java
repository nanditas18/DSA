/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/middle-swap/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	public void middleSwap(int[][] mat) {
		for (int j = 0; j < 4; j++) {
			int temp = mat[1][j];
			mat[1][j] = mat[2][j];
			mat[2][j] = temp;
		}
		for (int i = 0; i < 4; i++) {
			int temp = mat[i][1];
			mat[i][1] = mat[i][2];
			mat[i][2] = temp;
		}
	}
}

