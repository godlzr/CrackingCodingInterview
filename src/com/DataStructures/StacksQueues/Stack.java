/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * 
 * Data Structures
 * Chapter 3
 * 
 * Implementation of Stack class
 * 
 * 3.6 Write a program to sort a stack in ascending order (with biggest items on top). 
 * You may use at most one additional stack to hold items, but you may not copy the 
 * elements into any other data structure (such as an array). 
 * The stack supports the following operations: push, pop, peek, and isEmpty.
 */ 
package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.Node;

public class Stack<T> {
	Node<T> top;
	public int length;
	
	public Node<T> pop() {
		if(top != null) {
			Node<T> item = top;
			top = top.next;
			length--;
			return item;
		}
		return null;
	}
	
	public void push(T d) {
		Node<T> t = new Node<T>(d);
		t.next = top;
		top = t;
		length++;
	}
	
	Node<T> peek() {
		return top;
	}
	

}
