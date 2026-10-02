"""
Problem Link : https://practice.geeksforgeeks.org/problems/linear-algebra-solve-linear-system/1
Platform     : GFG
Difficulty   : Medium
"""

class Solution:
    def solveLinearSystem(self, a, b):
        return np.linalg.solve(a, b)
