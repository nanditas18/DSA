/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < rows; j++) {
                ans.get(i).add(mat[j][i]);
            }
        }
        return ans;
    }
}

