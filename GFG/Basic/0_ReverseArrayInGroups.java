/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public void reverseInGroups(int[] arr, int k) {
		int n = arr.length;
		if (n<k) {
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = arr[n - i - 1];
			}
			for (int i = 0; i < n; i++) {
				arr[i] = temp[i];
			}
		}
		else {
			for (int i = 0; i < n; i += k) {
				int left = i;
				int right = Math.min(i + k - 1, n - 1);
				while (left < right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
			}
		}
	}
}

