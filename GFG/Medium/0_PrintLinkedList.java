/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/*
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	public ArrayList<Integer> printList(Node head) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Node temp = head;
		while (temp != null) {
			ans.add(temp.data);
			temp = temp.next;
		}
		return ans;
	}
}

