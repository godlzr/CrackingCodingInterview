package com.DataStructures.StacksQueues;
import java.util.Vector;

public class SetOfStacks<Number> {
	int threshold;
	int length;
	Vector<Stack> stacklist = new Vector<Stack>();
	int stackIndex;
	
	SetOfStacks(int t){
		threshold = t;
		Stack newstack = new Stack();
		stacklist.add(newstack);
		stackIndex = 0;
	}
	void push(Number d) {
		if(stacklist.get(stackIndex).length == threshold) {
			Stack newstack = new Stack();
			stacklist.add(newstack);
			stackIndex++;
			stacklist.get(stackIndex).push(d);
		}
		stacklist.get(stackIndex).push(d);
	}
	
	Node<Number> pop() {
		
		Node<Number> item = stacklist.get(stackIndex).pop();
		
		if(stacklist.get(stackIndex).length == 0) {
			stacklist.remove(stackIndex);
			stackIndex--;
			return item;
		}
		
		return item;
	}
	
	Node<Number> popAt(int i) {
		Node<Number> item = stacklist.get(i).pop();
		Stack tmpStack = new Stack();
		while(stackIndex > (i-1)) {
			Node<Number> tmpNode = this.pop();
			tmpStack.push(tmpNode);
		}
		while(tmpStack.length > 0) {
			Node<Number> tmpNode = tmpStack.pop();
			this.push(tmpNode.data);
		} 
		return item;
	}

}
