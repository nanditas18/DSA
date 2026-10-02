/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/add-two-fractions/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

	public ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int num = (num1 * den2 + num2 * den1);
		int den = (den1 * den2);
		int commonDivisor = gcd(Math.abs(num), Math.abs(den));
		num /= commonDivisor;
		den /= commonDivisor;
		ans.add(num);
		ans.add(den);
		return ans;
	}
}
