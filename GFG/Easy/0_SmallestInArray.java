/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/vector-min-element--151110/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	public int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}

