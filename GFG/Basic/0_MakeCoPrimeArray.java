/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/make-coprime-array3058/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int countCoPrime(int[] arr) {
        int insertions = 0;
        for (int i = 1; i < arr.length; i++) {
            if (gcd(arr[i - 1], arr[i]) != 1) {
                insertions++;
            }
        }
        return insertions;
    }
}
