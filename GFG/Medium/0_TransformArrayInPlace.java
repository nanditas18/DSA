/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public void arrange(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] + (arr[(int)arr[i]] % n) * n;
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / n;
		}
	}
}

