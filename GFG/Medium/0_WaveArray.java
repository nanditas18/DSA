/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public void sortInWave(int arr[]) {
		int n = arr.length;
		if (n == 1) {
			return;
		}
		else if (n%2 == 0) {
			for (int i = 0; i<n-1; i += 2) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		else if (n%2 != 0) {
			for (int i = 0; i<n-1; i += 2) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}
}

