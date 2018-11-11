package com.dl.datastructure.stack;

public class Stack {

	private Node head;
	
	public int pop() {
		if(head == null) {
			return -1;
		} 
		int data = head.data;
		head = head.next;
		return data;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public int size() {
		Node node = head;
		int size = 0;
		while(node != null) {
			size++;
			node = node.next;
		}
		return size;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void printStack() {
		Node node = head;
		while(node != null) {
			node.printNode();
			node = node.next;
		}
		System.out.println();
	}
	
	
	/*
	 *  1 < 2 > 3 > 4
	 * 
	 * 
	 */
	
	public Node reverse() {
		Node node = head;
		Node next = null;
		Node prev = null;
		
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		
		return prev;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(4);
		stack.push(41);
		stack.push(412);
		stack.push(423);
		stack.push(434);
		stack.push(445);
		
		stack.printStack();
		
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.printStack();
		
	}
}
