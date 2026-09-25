/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

import java.util.Arrays;

class Solution {
    void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
