/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/predict-the-column/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int maxZeros(int[][] arr) {
		int maxcount = 0;
		int element = -1;
		int N = arr.length;
		for (int i = 0; i<N; i++) {
			int count = 0;
			for (int j = 0; j<N; j++) {
				if (arr[j][i] == 0) {
					count++;
				}
			}
			if (count>maxcount) {
				maxcount = count;
				element = i;
			}
		}
		return element;
	}
}

