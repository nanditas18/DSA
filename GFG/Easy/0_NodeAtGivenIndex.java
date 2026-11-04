/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
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
    public int getNode(Node head, int k) {
        int position = 1;
        while (head != null) {
            if (position == k) {
                return head.data;
            }
            head = head.next;
            position++;
        }
        return -1;
    }
}
