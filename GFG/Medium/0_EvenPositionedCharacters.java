/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/for-loop-2/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public static void utility(String s) {
		int n = s.length();
		for (int i = 0; i<n; i += 2) {
			System.out.print(s.charAt(i));
			
		}
	}
}

