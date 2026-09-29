/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
