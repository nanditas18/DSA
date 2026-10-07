/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/gray-code-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int binaryToGray(int n) {
		int num1 = n;
		int res = (n^(num1 << 1));
		return (res>> 1);
	}
}

