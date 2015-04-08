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
