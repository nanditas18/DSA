/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of Linked List Node
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
	public int count(Node head, int key) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.data == key) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}
}

