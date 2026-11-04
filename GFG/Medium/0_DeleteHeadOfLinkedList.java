/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/delete-head-of-linked-list/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/* Structure of Linked List Node
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = next;
	}
} */

class Solution {
	public Node deleteHead(Node head) {
		return head = head.next;
	}
}

