/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-divisible-by-43813/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

public class Solution {
	boolean divisibleBy4(String s) {
		s = s.trim();
		if (!s.matches("\\d+"))
			return false;
		int n = s.length();
		return (n == 1 ? s.charAt(0) - '0' : (s.charAt(n - 2) - '0') * 10 + (s.charAt(n - 1) - '0')) % 4 == 0;
	}
}

