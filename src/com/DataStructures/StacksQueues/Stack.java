package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;

public class Stack<Number> {
	Node<Number> top;
	int length;
	
	Node<Number> pop() {
		if(top != null) {
			Node<Number> item = top;
			top = top.next;
			length--;
			return item;
		}
		return null;
	}
	
	void push(Number d) {
		Node<Number> t = new Node<Number>(d);
		t.next = top;
		top = t;
		length++;
	}
	
	Node<Number> peek() {
		return top;
	}
}
