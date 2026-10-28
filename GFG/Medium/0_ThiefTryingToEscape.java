/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/thief-try-to-excape0710/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int totalJumps(int[] arr, int x, int y) {
        int N = arr.length;
        int jumps = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] <= x)
                jumps += 1;
            else
                jumps += (int) Math.ceil((double)(arr[i] - x) / (double)(x - y)) + 1;
        }
        return jumps;
    }
}
