/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/fizz-buzz/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> a = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i%3 == 0 && i%5 == 0) {
				a.add("FizzBuzz");
			}
			else if (i%3 == 0) {
				a.add("Fizz");
			}
			else if (i%5 == 0) {
				a.add("Buzz");
			}
			else {
				String str = String.valueOf(i);
				a.add(str);
			}
		}
		return a;
	}
}

