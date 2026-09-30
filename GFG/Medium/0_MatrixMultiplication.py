"""
Problem Link : https://practice.geeksforgeeks.org/problems/matrix-multiplication--132654/1
Platform     : GFG
Difficulty   : Medium
"""

import numpy as np
class Solution:
    def matrixMultiplication(self, mat1, mat2):
        matrix1 = np.array(mat1)
        matrix2 = np.array(mat2)
        result = np.dot(matrix1, matrix2)
        return result

