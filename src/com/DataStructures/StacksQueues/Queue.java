package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;
public class Queue<T>{
	Node<T> first, last;
	int length;
	
	public Queue(){
		length = 0;
	}
	public void enqueue(T d) {
		if(first == null) {
			last = new Node<T>(d);
			first = last;
		} else {
			Node<T> item = new Node<T>(d);
			last.next = item;
			last = item;
		}
		length++;
	}
	
	public Node<T> dequeue() {
		if(first == null)
			return null;
		else {
			Node<T> item = first;
			first = first.next;
			if(first == null)
				last = null;
			length--;
			return item;
		}
	}
	public boolean isEmpty() {
		if(length == 0)
			return true;
		else
			return false;
	}
	
}
