/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/elements-before-which-no-element-is-bigger0602/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int countElements(int[] arr) {
		int max = arr[0], count = 1;
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]>max) {
				count++;
				max = arr[i];
			}
		}
		return count;
	}
}

