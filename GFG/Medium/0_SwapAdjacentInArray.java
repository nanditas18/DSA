/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/need-some-change/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public void swapElements(int[] arr) {
		int i = 0;
		int j = i + 2;
		while (i<arr.length && j<arr.length)
			{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
	}
}

