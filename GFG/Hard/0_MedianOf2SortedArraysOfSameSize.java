/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-same-size/1
 * Platform     : GFG
 * Difficulty   : Hard
 */

class Solution {
	public double medianOf2(int a[], int b[]) {
		int l1 = a.length;
		int l2 = b.length;
		int len = l1 + l2;
		int[] ans = new int[len];
		for (int i = 0; i < l1; i++) {
			ans[i] = a[i];
		}
		for (int i = 0; i < l2; i++) {
			ans[l1 + i] = b[i];
		}
		Arrays.sort(ans);
		if (len % 2 != 0) {
			return ans[len / 2];
		} 
		else {
			return (ans[len / 2] + ans[(len / 2) - 1]) / 2.0;
		}
	}
}

