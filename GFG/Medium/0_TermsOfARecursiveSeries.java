/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/gf-series3535/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public ArrayList<Integer> gfSeries(int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (n >= 1){
			ans.add(0);
		}
		if (n >= 2){
			ans.add(1);
		}
		geek(3, n, ans);
		return ans;
	}
	public void geek(int curr, int n, ArrayList<Integer> ans) {
		if (curr > n) {
			return;
		}
		int tn1 = ans.get(curr - 3);
		int tn2 = ans.get(curr - 2);
		int tn = (tn1 * tn1) - tn2;
		ans.add(tn);
		geek(curr + 1, n, ans);
	}
}

