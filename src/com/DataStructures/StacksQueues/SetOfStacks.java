/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 3
 * 3.3 Imagine a (literal) stack of plates. If the stack gets too high, 
 * it might topple. Therefore, in real life, we would likely start a new 
 * stack when the previous stack exceeds some threshold. Implement a data 
 * structure SetOfStacks that mimics this. SetOfStacks should be composed 
 * of several stacks and should create a new stack once the previous one 
 * exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave 
 * identically to single stack (that is, pop() should return the same 
 * values as it would if there were just a singly stack).
 *
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */ 
package com.DataStructures.StacksQueues;
import java.util.Vector;

public class SetOfStacks<T> {
	int threshold;
	int length;
	Vector<Stack<T>> stacklist = new Vector<Stack<T>>();
	int stackIndex;
	
	SetOfStacks(int t){
		threshold = t;
		Stack<T> newstack = new Stack<T>();
		stacklist.add(newstack);
		stackIndex = 0;
	}
	void push(T d) {
		if(stacklist.get(stackIndex).length == threshold) {
			Stack<T> newstack = new Stack<T>();
			stacklist.add(newstack);
			stackIndex++;
			stacklist.get(stackIndex).push(d);
		}
		stacklist.get(stackIndex).push(d);
	}
	
	Node<T> pop() {
		
		Node<T> item = stacklist.get(stackIndex).pop();
		
		if(stacklist.get(stackIndex).length == 0) {
			stacklist.remove(stackIndex);
			stackIndex--;
			return item;
		}
		
		return item;
	}
	
	Node<T> popAt(int i) {
		Node<T> item = stacklist.get(i).pop();
		Stack<T> tmpStack = new Stack<T>();
		while(stackIndex > (i-1)) {
			Node<T> tmpNode = this.pop();
			tmpStack.push(tmpNode.data);
		}
		while(tmpStack.length > 0) {
			Node<T> tmpNode = tmpStack.pop();
			this.push(tmpNode.data);
		} 
		return item;
	}

}
