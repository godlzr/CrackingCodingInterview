package com.DataStructures.StacksQueuesTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.StacksQueues.Stack;
import com.DataStructures.StacksQueues.StackHelper;
public class stackTest {

	@Test
	public void test() {
		Stack s = new Stack();
		s.push(5);
		s.push(8);
		s.push(3);
		s.push(2);
		s.push(4);
		s.push(7);
		s.push(1);
		StackHelper sh = new StackHelper();
		sh.stackPrint(s);
		sh.ascendingSort(s);
		sh.stackPrint(s);
		
		
	}

}
