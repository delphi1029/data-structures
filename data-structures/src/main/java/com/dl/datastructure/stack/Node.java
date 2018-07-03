package com.dl.datastructure.stack;

public class Node {
	
	public int data;
	public Node next;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	public void printNode() {
		System.out.print("{ "+data+" }");
	}

}
