/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/set-kth-bit3724/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int setKthBit(int n, int k) {
		int mass = (1 << k);
		return (n | mass);
	}
}

