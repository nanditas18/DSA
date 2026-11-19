/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int findCeil(int[] arr, int x) {
		int n = arr.length;
		int l = 0;
		int h = n - 1;
		int ans = -1;
		while (l <= h) {
			int m = (l + h)/2;
			if (arr[m] >= x) {
				ans = m ;
				h = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		return ans;
	}
}

