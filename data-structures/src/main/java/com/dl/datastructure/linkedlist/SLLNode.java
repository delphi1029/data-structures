package com.dl.datastructure.linkedlist;

public class SLLNode {
	
	public int data;
	public SLLNode next;

	
	public SLLNode(int data) {
		super();
		this.data = data;
	}


	public void displayNode() {
		System.out.println("{ "+data+" }");
	}
}
