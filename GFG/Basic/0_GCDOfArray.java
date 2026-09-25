/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int gcd(int n, int arr[]) {
		if (arr == null || n <= 0 || arr.length < n) {
			return 0;
		}
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			result = gcdTwo(result, arr[i]);
			if (result == 1) {
				break;
			}
		}
		
		return Math.abs(result);
	}
	private int gcdTwo(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
