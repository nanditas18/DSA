/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string-with-spaces-intact5213/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	String reverses(String s) {
		char[] arr = s.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] == ' ') {
				left++;
			}
			else if (arr[right] == ' ') {
				right--;
			}
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return new String(arr);
	}
}

