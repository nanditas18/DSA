/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class myStack {
	private int[] arr;
	private int capacity;
	private int top;
	public myStack(int n) {
		capacity = n;
		arr = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == capacity - 1);
	}
	
	public void push(int x) {
		if (top == capacity - 1) {
			return;
		}
		arr[++top] = x;
	}
	
	public int pop() {
		if (top == -1) {
			return - 1;
		}
		return arr[top--];
	}
	
	public int peek() {
		if (top == -1) {
			return - 1;
		}
		return arr[top];
	}
}

