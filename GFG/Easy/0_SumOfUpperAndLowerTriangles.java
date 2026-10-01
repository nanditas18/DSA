/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	public ArrayList<Integer> sumTriangles(int mat[][]) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = mat.length;
		int upper_sum = 0;
		int lower_sum = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j) {
					upper_sum += mat[i][j];
				}
				
				if (i >= j) {
					lower_sum += mat[i][j];
				}
			}
		}
		ans.add(upper_sum);
		ans.add(lower_sum);
		return ans;
	}
}

