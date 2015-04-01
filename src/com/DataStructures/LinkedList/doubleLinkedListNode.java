package com.DataStructures.LinkedList;

public class doubleLinkedListNode {
	doubleLinkedListNode prev = null;
	doubleLinkedListNode next = null;
	int data;
	
	public doubleLinkedListNode(int d) {
		data = d;
	}
	
	void appendToTail(int d) {
		doubleLinkedListNode end = new doubleLinkedListNode(d);
		doubleLinkedListNode n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
		end.prev = n;
	}
}
