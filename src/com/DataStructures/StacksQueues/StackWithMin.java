/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 3
 * 3.2 How would you design a stack which, in addition to push and pop, 
 * also has a function min which returns the minimum element? 
 * Push, pop and min should all operate in O(1) time.
 */ 
package com.DataStructures.StacksQueues;
import com.DataStructures.StacksQueues.Stack;

public class StackWithMin<T extends Comparable> extends Stack<T>{
	Stack<T> minStack = null;
	
	public void push(T d) {
		Node<T> t = new Node(d);
		t.next = top;
		top = t;
		if(this.minStack.peek() != null) {
			if(this.minStack.peek().data.compareTo(t.data) >  0)
				this.minStack.push(d);
		} else
			this.minStack.push(d);
	}
	
	public Node<T> pop() {
		if(top != null) {
			Node<T> item = top;
			top = top.next;
			if(item.data.compareTo(this.minStack.peek().data) == 0)
				this.minStack.pop();
			return item;
		}
		return null;
	}
	
	public Node<T> min() {
		return this.minStack.peek();
	}
	

}
