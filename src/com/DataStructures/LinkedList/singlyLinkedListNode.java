package com.DataStructures.LinkedList;

public class singlyLinkedListNode<T> {
	
	public singlyLinkedListNode<T> next = null;
	boolean visialbe = true;//flag for printing
	public T data;
	
	public singlyLinkedListNode(T d) {
		data = d;
	}
	
	public void appendToTail(T d) {
		singlyLinkedListNode<T> end = new singlyLinkedListNode<T>(d);
		singlyLinkedListNode<T> n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

}
