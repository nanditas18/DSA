/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Linked List Node Structure
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	int getMiddle(Node head) {
		if (head == null) {
			return - 1;
		}
		int length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		int midIndex = length / 2;
		temp = head;
		for (int i = 0; i < midIndex; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
}

