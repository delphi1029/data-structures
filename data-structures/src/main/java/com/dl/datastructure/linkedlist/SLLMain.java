package com.dl.datastructure.linkedlist;

public class SLLMain {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		list.print();
		
		System.out.println();
		
		System.out.println(list.findMiddleNode());

	}

}
