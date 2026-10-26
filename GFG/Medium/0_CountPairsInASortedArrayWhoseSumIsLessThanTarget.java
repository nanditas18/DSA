/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-pairs-in-a-sorted-array-whose-sum-is-less-than-target/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	int countPairs(int arr[], int target) {
		int ans = 0;
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			if (arr[start] + arr[end] < target) {
				ans += (end - start);
				start++;
			}
			else {
				end--;
			}
		}
		
		return ans;
	}
}

