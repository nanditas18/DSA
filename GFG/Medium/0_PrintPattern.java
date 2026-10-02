/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-pattern3549/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public ArrayList<Integer> pattern(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		if (n <= 0) {
			list.add(n);
			return list;
		}
		
		solve(n, list);
		return list;
	}
	
	public void solve(int n, ArrayList<Integer> list) {
		if (n <= 0) {
			list.add(n);
			return;
		}
		
		list.add(n);
		solve(n - 5, list);
		list.add(n);
	}
}

