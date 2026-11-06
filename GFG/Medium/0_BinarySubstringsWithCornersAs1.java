/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int binarySubstring(String s) {
		int n = s.length();
		int co = 0;
		
		for (int i = 0; i<n; i++) {
			if (s.charAt(i) == '1') {
				co++;
			}
		}
		int sum = 0;
		co--;
		while (co>0) {
			sum += co;
			co--;
		} 
		return sum;
	}
}

