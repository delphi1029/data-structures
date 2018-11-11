package com.dl.datastructure.linkedlist;

public class SingleLinkedList {
	
	private SLLNode head;
	
	private SLLNode tail;
	
	 public SingleLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	public void add(int data) {
		 SLLNode node = new SLLNode(data);
		 if(head == null) {
			 head = node;
		 } else {
			 tail.next = node;
		 }
		 tail = node;
	 }
	 
	 public int removeFirst() {
		 SLLNode node = head;
		 if(head != null) {
			 head = head.next;
		 }
		 return node == null? 0:node.data;
	 }
	 
	 public int removeLast() {
		 SLLNode node = head;
		 while(node.next != null) {
			 node = node.next;
		 }
		 tail = node;
		 tail.next = null;
		 return (node == null ? 0:node.data);
	 }
	 
	 public void print() {
		 SLLNode node = head;
		 while(node != null) {
			 System.out.print(node);
			 node = node.next;
			 System.out.print(" -> ");
		 }
	 }
	 
	 public int findMiddleNode() {
		 SLLNode ptr1 = head;
		 SLLNode ptr2 = head;
		 
		 while(ptr1 != null && ptr1.next !=null) {
			 ptr1 = ptr1.next.next;
			 ptr2 = ptr2.next;
			 
		 }
		 return ptr2 == null? 0:ptr2.data;
	 }
	 
	 public int nthNodeFromEnd(int n) {
		 SLLNode ptr = head;
		 SLLNode ptrNth = head;
		 
		int count = 1; 
		while(ptr!=null) {
			if(count > n)
				ptrNth = ptrNth.next;
			ptr = ptr.next;
			count++;
		 }
		return ptrNth.data;
	 }
	 
	 public void reverse() {
		 SLLNode prev = null;
		 SLLNode current = head;
		 SLLNode next = null;
		 
		 while(current != null) {
			 next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
		 }
		 
	 }
	 
	 
	 private static class SLLNode {
		
		private int data;
		private SLLNode next;
		
		public SLLNode(int data) {
			super();
			this.data = data;
		}

		@Override
		public String toString() {
			return data+"";
		}
		
	 }

}
