/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                break;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}
