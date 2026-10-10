/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0; int j = 0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j])
				i++;
			else if (arr1[i]>arr2[j])
				j++;
			
			else {
				if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
					list.add(arr1[i]);
					
				}
				i++; j++;
			}
		}
		return list;
	}
}

