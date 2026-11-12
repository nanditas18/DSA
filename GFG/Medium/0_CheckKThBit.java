/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class CheckBit {
	static boolean checkKthBit(int n, int k) {
		int mass = (n>> k);
		return (mass % 2 == 1);
	}
}

