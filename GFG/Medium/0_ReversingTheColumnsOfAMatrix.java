/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reversing-the-columns-of-a-matrix-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static void reverseCol(int matrix[][]) {
		int n = matrix.length;
		int m = matrix[0].length;
		for (int i = 0; i<n; i++) {
			int st = 0, end = matrix[i].length - 1;
			while (st<end) {
				int temp = matrix[i][st];
				matrix[i][st] = matrix[i][end];
				matrix[i][end] = temp;
				st++;
				end--;
			}
		}
	}
}
