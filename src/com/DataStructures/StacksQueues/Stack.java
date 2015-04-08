package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;

public class Stack<Number> {
	Node<Number> top;
	
	Node<Number> pop() {
		if(top != null) {
			Node<Number> item = top;
			top = top.next;
			return item;
		}
		return null;
	}
	
	void push(Number d) {
		Node<Number> t = new Node<Number>(d);
		t.next = top;
		top = t;
	}
	
	Node<Number> peek() {
		return top;
	}
}
