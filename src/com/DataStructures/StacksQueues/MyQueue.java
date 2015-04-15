/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 3
 * 3.5 Implement a MyQueue class which implements a queue using two stacks.
 */ 
package com.DataStructures.StacksQueues;

import com.DataStructures.StacksQueues.*;

public class MyQueue<T> {
	Stack<T> eqStack = new Stack<T>();
	Stack<T> dqStack = new Stack<T>();
	//---------------------------------------------------
	//The first version of enqueue&dequeue implemenation 
	public void enqueue(T d) {
		while(dqStack.length > 0) {
			Node<T> item = dqStack.pop();
			eqStack.push(item.data);
		}
		eqStack.push(d);
	}	
	public Node<T> dequeue() {
		while(eqStack.length > 0) {
			Node<T> item = eqStack.pop();
			dqStack.push(item.data);
		}
		return dqStack.pop();
	}
	//---------------------------------------------------
	//The second version of enqueue&dequeue implemenation 
	public void enqueueLess(T d) {
		eqStack.push(d);
	}
	public Node<T> dequeueLess() {
		if(dqStack.length == 0) {
			while(eqStack.length > 0) {
				Node<T> item = eqStack.pop();
				dqStack.push(item.data);
			}
		}
		return dqStack.pop();
	}
	
}
