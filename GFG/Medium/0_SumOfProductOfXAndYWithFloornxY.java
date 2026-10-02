/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-product-of-x-and-y-with-floornx-y3711/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int sumofproduct(int n) {
		int up = n;
		int low = 1;
		int sum = 0;
		for (int i = 0; i<n; i++)
			{
			sum = sum + (int)Math.floor(up/low)*low;
			low++;
		}
		return sum;
		
	}
}

