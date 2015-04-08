package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;
public class Queue<T> {
	Node first, last;
	
	void enqueue(T d) {
		if(first == null) {
			last = new Node(d);
			first = last;
		} else {
			Node item = new Node(d);
			last.next = item;
			last = item;
		}
	}
	
	Node dequeue() {
		if(first == null)
			return null;
		else {
			Node item = first;
			first = first.next;
			if(first == null)
				last = null;
			return item;
		}
	}
	
}
