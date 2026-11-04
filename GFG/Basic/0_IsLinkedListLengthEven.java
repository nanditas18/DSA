/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

/* structure of link list node
class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
*/
class Solution {
	public boolean isEven(Node head) {
		int length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		
		if (length%2 == 0) {
			return true;
		}
		return false;
	}
}

