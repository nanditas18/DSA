/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int[] findSum(int n) {
		int[] ans = new int[2];
		int count_odd = ((n + 1)/2);
		int count_even = (n/2);
		ans[0] = (count_odd*count_odd);
		ans[1] = (count_even*(count_even + 1));
		return ans;
	}
}

