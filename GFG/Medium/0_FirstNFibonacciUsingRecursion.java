/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (n <= 0) {
            return ans;
        }
        ans.add(0);
        if (n == 1) {
            return ans;
        }
        ans.add(1);
        for (int i = 2; i < n; i++) {
            int nextFib = ans.get(i - 2) + ans.get(i - 1);
            ans.add(nextFib);
        }
        return ans;
    }
}
