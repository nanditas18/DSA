/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public ArrayList<Integer> boundaryTraversal(int mat[][]) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int rows = mat.length;
		int cols = mat[0].length;
		for (int j = 0; j < cols; j++) {
			result.add(mat[0][j]);
		}
		for (int i = 1; i < rows; i++) {
			result.add(mat[i][cols - 1]);
		}
		if (rows > 1) {
			for (int j = cols - 2; j >= 0; j--) {
				result.add(mat[rows - 1][j]);
			}
		}
		if (cols > 1) {
			for (int i = rows - 2; i > 0; i--) {
				result.add(mat[i][0]);
			}
	
		}
		return result;
	}
}

