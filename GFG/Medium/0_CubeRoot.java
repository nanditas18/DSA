/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/cube-root-of-a-number0915/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int cubeRoot(int n) {
		int i = 1;
		while (i * i * i <= n) {
			i++;
		}
		return i - 1;
	}
};

