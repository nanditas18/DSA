/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-palindrome3857/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static int isSumPalindrome(int n) {
		int total = n;
		for (int i = 0; i <= 5; i++) {
			if (total == Palindrome(total)) {
				return total;
			}
			int newNum = Palindrome(n);
			total += newNum;
			n = total;
		}
		return - 1;
	}
	public static int Palindrome(int num) {
		int newNum = 0;
		while (num>0) {
			newNum = newNum*10 + (num%10);
			num = num/10;
		}
		return newNum;
	}
}

