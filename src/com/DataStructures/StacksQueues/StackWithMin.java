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
import com.DataStructures.StacksQueues.*;

public class StackWithMin extends Stack<Number>{
	Stack<Number> minStack = null;
	
	public void push(Number d) {
		Node<Number> t = new Node<Number>(d);
		t.next = top;
		top = t;
		if(this.minStack.peek() != null) {
			if(this.minStack.peek().data.doubleValue() >  t.data.doubleValue())
				this.minStack.push(d);
		} else
			this.minStack.push(d);
	}
	
	public Node<Number> pop() {
		if(top != null) {
			Node<Number> item = top;
			top = top.next;
			if(item.data.doubleValue() == this.minStack.peek().data.doubleValue())
				this.minStack.pop();
			return item;
		}
		return null;
	}
	
	public Node<Number> min() {
		return this.minStack.peek();
	}
	

}
