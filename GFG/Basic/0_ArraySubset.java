/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

import java.util.Arrays;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0; 
        int j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                return false;
            }
        }
        return j == b.length;
    }
}
