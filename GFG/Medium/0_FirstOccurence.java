/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-strstr/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	int firstOccurence(String txt, String pat) {
		StringBuilder sb = new StringBuilder(txt) ;
		return txt.indexOf(pat);
	}
}

