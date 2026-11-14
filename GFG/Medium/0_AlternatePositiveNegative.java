/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	void rearrange(ArrayList<Integer> arr) {
		int size = arr.size();
		ArrayList<Integer> positive = new ArrayList<>(size);
		ArrayList<Integer> negative = new ArrayList<>(size);
		for (int num: arr) {
			if (num >= 0) {
				positive.add(num);
			}
			else {
				negative.add(num);
			}
		}
		int p = 0;
		int neg = 0;
		int i = 0;
		while (p<positive.size() && neg<negative.size()) {
			arr.set(i++, positive.get(p++));
			arr.set(i++, negative.get(neg++));
		}
		while (p<positive.size()) {
			arr.set(i++, positive.get(p++));
		}
		while (neg<negative.size()) {
			arr.set(i++, negative.get(neg++));
		}
	}
}

