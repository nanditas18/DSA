/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/squares-in-a-matrix5716/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int squaresInMatrix(int m, int n) {
		if (m == n) return ((m * (m + 1)
			* ((m*2) + 1))/6);
		int min = Math.min(m, n);
		int temp = min;
		min = min - 1;
		int partOne = (temp*(m*n));
		int partTwo = ((-m - n) * ((min*(min + 1))/2));
		int partThree = ((min * (min + 1) * ((min*2) + 1))/6);
		return partOne + partTwo + partThree;
	}
};

