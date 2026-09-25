/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-divisible-by-52730/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public boolean divisibleBy5(String n) {
		int lastchar = n.charAt(n.length() - 1);
		if (lastchar == '0' || lastchar == '5') {
			return true;
		}
		return false;
	}
};

