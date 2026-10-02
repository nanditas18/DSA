/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-the-number-is-fibonacci4654/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public boolean isFibonacci(int n) {
        if (n<=1){
            return true;
        }
        else{
            int a=0;
            int b=1;
            int c=1;
            while (c<=n){
                if (c==n){
                    return true;
                }
                c=a+b;
                a=b;
                b=c;
            }
            return false;
        }
    }
}
