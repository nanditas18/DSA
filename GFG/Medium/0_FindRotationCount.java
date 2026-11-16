/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/rotation4723/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int findKRotation(int arr[]) {
		int n = arr.length;
		int l = 0;
		int r = n - 1;
		while (l<r) {
			int m = (l + r)/2;
			if (arr[m]>arr[r]) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		return l;
	}
}

