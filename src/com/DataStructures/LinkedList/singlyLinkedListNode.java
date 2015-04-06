package com.DataStructures.LinkedList;

public class singlyLinkedListNode {
	
	public singlyLinkedListNode next = null;
	boolean visialbe = true;//flag for printing
	public int data;
	
	public singlyLinkedListNode(int d) {
		data = d;
	}
	
	public void appendToTail(int d) {
		singlyLinkedListNode end = new singlyLinkedListNode(d);
		singlyLinkedListNode n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

}
