/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/distinct-sorted--124713/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public ArrayList<Integer> uniqueSorted(int arr[]) {
		ArrayList<Integer>list = new ArrayList<>();
		Arrays.sort(arr);
		int res = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] == arr[i - 1])
				{
				continue;
			} else {
				list.add(res);
				res = arr[i];
			}
		}
		list.add(res);
		return list;
	}
}

