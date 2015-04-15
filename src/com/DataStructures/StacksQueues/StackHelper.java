package com.DataStructures.StacksQueues;

public class StackHelper<T extends Comparable> extends Stack<T>{
	/*
	 * 3.6 Write a program to sort a stack in ascending order (with biggest items on top). 
	 * You may use at most one additional stack to hold items, but you may not copy the 
	 * elements into any other data structure (such as an array). 
	 * The stack supports the following operations: push, pop, peek, and isEmpty.
	 */
		public void ascendingSort(Stack<T> s) {
			Stack<T> tmp = new Stack<T>();
			while(s.length > 0) {
				Node<T> top = s.pop();

				while(tmp.length != 0 && top.data.compareTo(tmp.top.data) > 0) {
					Node<T> tmpTop = tmp.pop();
					s.push(tmpTop.data);
				}
				tmp.push(top.data);
			}
			s.top = tmp.top;
		}
		
		public void stackPrint(Stack<T> s) {
			Node<T> cur = s.top;
			while(cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}			
		}
}
