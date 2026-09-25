/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	boolean isDigitSumPalindrome(int n) {
		int sum = 0;
		int temp, r;
		temp = n;
		while (temp != 0) {
			r = temp%10;
			sum += r;
			temp /= 10;
		}
		String s = Integer.toString(sum);
		String stringRev = new StringBuilder(s).reverse().toString();
		return s.equals(stringRev);
	}
}

