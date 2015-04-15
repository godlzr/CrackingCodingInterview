package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;
public class Queue<T>{
	Node<T> first, last;
	
	void enqueue(T d) {
		if(first == null) {
			last = new Node<T>(d);
			first = last;
		} else {
			Node<T> item = new Node<T>(d);
			last.next = item;
			last = item;
		}
	}
	
	Node<T> dequeue() {
		if(first == null)
			return null;
		else {
			Node<T> item = first;
			first = first.next;
			if(first == null)
				last = null;
			return item;
		}
	}
	
}
