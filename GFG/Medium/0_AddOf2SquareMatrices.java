/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/addition-of-two-square-matrices4916/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public void addMat(int[][] a, int[][] b) {
		for (int i=0;i<a.length;i++){
		    for (int j=0;j<a.length;j++){
		        a[i][j]=a[i][j]+b[i][j];
		    }
		}
	}
}
