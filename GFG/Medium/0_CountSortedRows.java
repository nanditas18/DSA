/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-sorted-rows2702/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int sortedCount(int[][] Mat) {
		int count = 0;
		int N = Mat.length;
		int M = Mat[0].length;
		for (int i = 0; i < N; i++) {
			int increCount = 0, decreCount = 0;
			for (int j = 0; j < M - 1; j++) {
				if (Mat[i][j] < Mat[i][j + 1]) {
					increCount++;
				}
				else if (Mat[i][j] > Mat[i][j + 1]) {
					decreCount++;
				}
			}
			
			if (increCount == M - 1) {
				count++;
			}
			else if (decreCount == M - 1) {
				count++;
			}
		}
		return count;
	}
}

