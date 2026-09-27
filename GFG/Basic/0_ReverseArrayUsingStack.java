/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-array-using-stack--143151/1
 * Platform     : GFG
 * Difficulty   : Basic
 */


class Solution {
    public void reverseArray(int[] arr) {
        if (arr == null) return;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
    }
}
