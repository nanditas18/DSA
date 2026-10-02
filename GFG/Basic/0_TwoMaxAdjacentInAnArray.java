/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/why-is-melody-so-chocolaty0446/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int maxAdjSum(int[] arr) {
		int max = 0;
		for (int i = 1; i<arr.length; i++) {
			if ((arr[i - 1]+arr[i])>max) {
				max = (arr[i - 1]+arr[i]);
			}
		}
		return max;
	}
}

