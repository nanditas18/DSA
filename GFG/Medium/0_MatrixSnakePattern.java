/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static ArrayList<Integer> snakePattern(int matrix[][]) {
		ArrayList<Integer> arr = new ArrayList<>();
		int track = 1;
		for (int i = 0; i<matrix.length; i++)
			{
			if (track%2 != 0)
				{
				int j = 0;
				while (j<matrix[i].length)
					{
					arr.add(matrix[i][j]);
					j++;
					
				}
				
			}
			else
				{
				int j = matrix[i].length - 1;
				while (j >= 0)
					{
					arr.add(matrix[i][j]);
					j--;
				}
			}
			track++;
		}
		return arr;
	}
}

