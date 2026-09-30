"""
Problem Link : https://practice.geeksforgeeks.org/problems/find-diagonal-elements-in-a-2d-numpy-array/1
Platform     : GFG
Difficulty   : Medium
"""

class Solution:
    def diagonalElements(self, arr):
        return np.array([arr[i][i] for i in range(len(arr))])
