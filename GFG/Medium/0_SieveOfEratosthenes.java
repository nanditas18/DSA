/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
  public ArrayList<Integer> sieve(int n) {
    ArrayList<Integer> ans = new ArrayList<>();
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);
    prime[0] = false;
    prime[1] = false;
    for (int i = 2; i * i <= n; i++) {
      if (prime[i] == true) {
        for (int j = i * i; j <= n; j = j + i) {
          prime[j] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (prime[i] == true) {
        ans.add(i);
      }
    }
    return ans;
  }
}
