/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/stacks-operations/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class myStack {
	private int[] arr;
	private int capacity;
	private int top = -1;
	public myStack() {
		this(100);
	}
	public myStack(int cap) {
		capacity = cap;
		arr = new int[capacity];
		top = -1;
	}
	
	public void push(int x) {
		if (top == capacity - 1) {
			System.out.print("Stack Overflow");
			return;
		}
		arr[++top] = x;
	}
	
	public int pop() {
		if (top == -1) {
			System.out.print("Stack Underflow");
			return - 1;
		}
		return arr[top--];
	}
	
	public int peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return - 1;
		}
		return arr[top];
	}
	
	public int getSize() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}

