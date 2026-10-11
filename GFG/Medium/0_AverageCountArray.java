/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/average-count-array2215/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public int[] countArray(int[] arr, int x) {
		int[] res = new int[arr.length];
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int j = 0; j<arr.length; j++) {
			mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
		}
		for (int i = 0; i<arr.length; i++) {
			int temp = (int)((arr[i]+x)/2);
			int cnt = 0;
			if (mp.containsKey(temp)) {
				cnt = mp.get(temp);
			}
			res[i] = cnt;
		}
		return res;
	}
}

