/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/get-smaller-elements/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public ArrayList<Integer> getSmaller(int arr[], int target) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]<target) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}
}

