/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-of-pow-even-number5440/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public int sumSqEven(int n) {
		int sum = 0;
		for (int i = 2; i <= 2*n; i = i + 2) {
			sum += i*i;
		}
		return sum;
	}
};

