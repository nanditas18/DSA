/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linkedlist-traversal/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

/*
class Node {
	int data;
	Node next;
	
	Node(int val) {
		data = val;
		next = null;
	}
}
*/

class Solution {
	void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

