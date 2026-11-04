/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/join-two-linked-lists/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/* Structure of linked list Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
}
*/
class Solution {
	public Node joinLists(Node head1, Node head2) {
		Node curr = head1;
		while (curr.next != null)
			{
			curr = curr.next;
		}
		curr.next = head2;
		return head1;
	}
}

