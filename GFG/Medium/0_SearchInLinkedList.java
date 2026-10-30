/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	public boolean searchKey(Node head, int key) {
		while (head != null) {
			if (key == head.data) return true;
			head = head.next;
		}
		return false;
	}
}

