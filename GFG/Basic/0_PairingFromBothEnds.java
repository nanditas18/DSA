/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/pairing-elements/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public ArrayList<ArrayList<Integer>> arrayOfPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(arr[left]);
            pair.add(arr[right]);
            result.add(pair);
            left++;
            right--;
        }
        return result;
    }
}
