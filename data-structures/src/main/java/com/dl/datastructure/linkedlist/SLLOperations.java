package com.dl.datastructure.linkedlist;

public class SLLOperations {
	
	public SLLNode addNode(SLLNode head, SLLNode nodeToAdd) {
		SLLNode node = head;
		
		if(node == null) {
			return nodeToAdd;
		}
		
		while(node.next != null) {
			node = node.next;
		}
		node.next = nodeToAdd;
		return head;
	}
	
	public SLLNode addNodeAtPosition(SLLNode head, SLLNode nodeToAdd, int position) {
		SLLNode node = head;
		
		if(position == 1 && head == null) {
			return nodeToAdd;
		}
		
		for(int i=1; i<position-1; i++) {
			node = node.next;
		}
		
		SLLNode temp = node.next;
		node.next = nodeToAdd;
		nodeToAdd.next = temp;
		return head;
	}
	
	/*public SLLNode getNode(SLLNode head,int position) {
		
	}*/
	
	public SLLNode deleteNode(SLLNode head,int position) {
		return null;
	}
	
	public void printList(SLLNode head) {
		SLLNode node = head;
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	public int size(SLLNode head) {
		int size = 0;
		SLLNode node = head;
		while(node != null) {
			size++;
			node = node.next;
		}
		return size;
	}
	
	public SLLNode nthNodeFromTheEnd(SLLNode head,int position) {
		SLLNode ptrA = head;
		SLLNode ptrB = head;
		int i=1;
		
		while(ptrA != null) {
			ptrA = ptrA.next;
			if(i>position) {
				ptrB = ptrB.next;
			}
			i++;
		}
		
		return ptrB;
	}
	
	/*
	 * 1  2 > 3 > null
	 * 
	 * 
	 */
	
	public SLLNode reverse(SLLNode head) {
		SLLNode node = head;
		SLLNode next = null;
		SLLNode prev = null;
		
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		
		return prev;
	}
	
	
	
	public SLLNode cloneList(SLLNode  head) {
		return null;
		
		
	}
	
	/*
	 *  1 -> 2 -> 3
	 *  null <- 1 2-> 3
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		SLLOperations sllOprations = new SLLOperations();
		SLLNode node1 = new SLLNode(4);
		SLLNode node2 = new SLLNode(41);
		SLLNode node3 = new SLLNode(412);
		SLLNode node4 = new SLLNode(423);
		SLLNode node5 = new SLLNode(434);
		SLLNode node6 = new SLLNode(445);
		
		SLLNode head = sllOprations.addNode(null, node1);
	
		
		head = sllOprations.addNode(head, node2);
		head = sllOprations.addNode(head, node3);
		head = sllOprations.addNode(head, node4);
		head = sllOprations.addNode(head, node5);
		head = sllOprations.addNode(head, node6);
		
		//sllOprations.printList(head);
		//head = sllOprations.addNodeAtPosition(head, new SLLNode(230), 3);
		sllOprations.printList(head);
		sllOprations.printList(sllOprations.reverse(head));
	}
}
