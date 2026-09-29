/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public static int smallestSubWithSum(int x, int[] arr) {
		int s = 0;
		int e = 0;
		int sum = 0;
		int ans = Integer.MAX_VALUE;
		int n = arr.length;
		
		while (e<n) {
			sum = sum + arr[e];
			
			while (sum>x) {
				ans = Math.min(ans, e - s + 1);
				sum = sum - arr[s];
				s++;
			}
			
			e++;
		}
		return ans == Integer.MAX_VALUE?0:ans;
	}
}

