/*
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 2
 * 2.1 Write code to remove duplicates from an unsorted linked list.
 * duplicateRemovel()
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is now allowed?
 * duplicateRemovelNobuffer()
 * 
 * 2.2 Implement an algorithm to find the kth to last element of a singly linked list.
 * getElementPtr()
 * getElementRecursive()
 * 
 * 2.3 Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 * deleteMidElement()
 * 
 * 2.4 Write code to partition a linked list around a value x, 
 * such that all nodes less than x come before all node greater than or equal to x.
 * listPartition()
 * 
 * 2.5 You have tow numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list, Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7->1->6) + (5->9->2). That is, 617+ 295.
 * Ouput: 2->1->9. That is, 912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * Input: (6->1->7) + (2->9->5). That is, 617 + 295.
 * Output: 9->1->2. That is, 912.
 * linkedListAdd()
 * 
 * 2.6 Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
 * EXAMPLE
 * Input: A->B->C->D->E->C [the same C as earlier]
 * Output: C
 * 
 *  
 * 
 * 2.7 implement a function to check if a linked list is palindrome.
 * isPalindrome
 */
package com.DataStructures.LinkedList;
import java.util.*;
import java.lang.Math;
import com.DataStructures.LinkedList.singlyLinkedListNode;
import com.DataStructures.LinkedList.doubleLinkedListNode;

public class linkedListHelper {
	int count = 0;
	
	public void linkedlistPrinter(singlyLinkedListNode list){
		while(list != null) {
			if(list.visialbe == true)
				System.out.print(" "+list.data );
			list = list.next;
		}
	}
	public void linkedlistPrinter(doubleLinkedListNode list){
		while(list != null) {
			System.out.print(" "+list.data );
			list = list.next;
		}
	}
	
	public void linkedListNodePrinter(singlyLinkedListNode node){

			System.out.print(" "+ node.data );
	}
	/*
	 * 2.1 Write code to remove duplicates from an unsorted linked list.
	 * FOLLOW UP
	 * How would you solve this problem if a temporary buffer is now allowed?
	 */
	public void duplicateRemovel(singlyLinkedListNode list ) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		singlyLinkedListNode cur = list;
		set.add(cur.data);	
		while(cur.next != null) {
			if(!set.add(cur.next.data)) {
				cur.next = cur.next.next;
			}else 
				cur = cur.next;
		}

	}
	
	public void duplicateRemovelNobuffer(singlyLinkedListNode list) {

		singlyLinkedListNode runner;
		singlyLinkedListNode cur = list;
		
		while(cur.next != null) {

			runner = cur;
			
			while(runner.next != null) {
				if (cur.data == runner.next.data) {
					runner.next = runner.next.next;
				}else
					runner = runner.next;
			}
			cur = cur.next;
		}

	}
/*
 * 2.2 Implement an algorithm to find the kth to last element of a singly linked list.
 */
	public singlyLinkedListNode getElementDoublePtr(singlyLinkedListNode list, int k) {
		
		singlyLinkedListNode head = list;
		singlyLinkedListNode tale = list;
		for(int i=0; i<k; i++) {
			if(tale.next != null)
				tale = tale.next;
			else {
				System.out.println("The size of the list is smaller than "+k);
				return null;
			}

		}
			
		while(tale.next != null) {

			head = head.next;
			tale = tale.next;
		}
		return head;
	}
	
	public singlyLinkedListNode getElementRecursive(singlyLinkedListNode head, int k) {
	
		if(head == null)
			return null;
		
		singlyLinkedListNode node = getElementRecursive(head.next,k);;
		
		if(count == k) {
			return head;
		}
		count++;
		return node;
	}
	
	/*
	 * 2.3 Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
	 * EXAMPLE
	 * Input: the node c from the linked list a->b->c->d->e
	 * Result: nothing is returned, but the new linked list looks like a->b->d->e
	 */
	public boolean deleteMidElement(singlyLinkedListNode c) {
		if(c == null)
			return false;
		
		if(c.next == null) {
			c.visialbe = false;//if c is the tale node, do not print it.
			return true;
		}
			
		c.data = c.next.data;
		c.next = c.next.next;
		return true;
	}
	/*
	 * 2.4 Write code to partition a linked list around a value x, 
	 * such that all nodes less than x come before all node greater than or equal to x.
	 */
	public singlyLinkedListNode listPartition(singlyLinkedListNode head, int x) {
		
		singlyLinkedListNode lessThanX = new singlyLinkedListNode(0);
		
		singlyLinkedListNode greaterThanX = new singlyLinkedListNode(0);
		
		singlyLinkedListNode cur = head;
		
		while(cur != null) {
			if (cur.data > x)
				greaterThanX.appendToTail(cur.data);
			else
				lessThanX.appendToTail(cur.data);
			cur = cur.next;
		}
		
		lessThanX.data = lessThanX.next.data;
		lessThanX.next = lessThanX.next.next;
		greaterThanX.data = greaterThanX.next.data;
		greaterThanX.next = greaterThanX.next.next;
		
		singlyLinkedListNode tale = lessThanX;
		while(tale.next != null)
			tale = tale.next;
		
		tale.next = greaterThanX;
		
		return lessThanX;
	}
	/* 
	 * 2.5 You have tow numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list, Write a function that adds the two numbers and returns the sum as a linked list.
	 * EXAMPLE
	 * Input: (7->1->6) + (5->9->2). That is, 617+ 295.
	 * Ouput: 2->1->9. That is, 912.
	 * FOLLOW UP
	 * Suppose the digits are stored in forward order. Repeat the above problem.
	 * EXAMPLE
	 * Input: (6->1->7) + (2->9->5). That is, 617 + 295.
	 * Output: 9->1->2. That is, 912.
	 */
	public singlyLinkedListNode linkedListAdd(singlyLinkedListNode l1, singlyLinkedListNode l2) {
		

		int value = 0;
		int carry = 1;
		while(l1 != null) {
			value += l1.data*carry;
			carry *= 10; 
			l1 = l1.next;
		}
		carry  = 1;
		while(l2 != null) {
			value += l2.data*carry;
			carry *= 10; 
			l2 = l2.next;
		}
		singlyLinkedListNode sum = new singlyLinkedListNode(value%10);
		for(int i = 100; Math.floor(value*10/i) != 0; i*=10 ) {
			sum.appendToTail((value%i)/(i/10));
			value -= value%i;
		}
		return sum;
	} 
	/*
	 * 2.6 Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.
	 * DEFINITION
	 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
	 * EXAMPLE
	 * Input: A->B->C->D->E->C [the same C as earlier]
	 * Output: C
	 */
	public singlyLinkedListNode getFirstNodeOfCircle(singlyLinkedListNode entry) {
		HashMap<singlyLinkedListNode, Boolean> map = new HashMap<singlyLinkedListNode, Boolean>();
		map.put(entry, true);
		entry = entry.next;
		while(!map.containsKey(entry)) {
			map.put(entry, true);
			entry = entry.next;
		}
		return entry;
	}
	
	
	
	/*
	 * 2.7 implement a function to check if a linked list is palindrome.
	 */
	public boolean isPalindrome(singlyLinkedListNode head) {
		Stack<singlyLinkedListNode> frontHalf = new Stack<singlyLinkedListNode>();
		int length = 0;
		singlyLinkedListNode cur = head;
		while(cur != null) {
			length ++;
			cur = cur.next;
		}
		cur = head;
		for(int i=0; i<length/2; i++) {
			frontHalf.push(cur);
			cur = cur.next;
		}
		if(length%2 != 0)
			cur = cur.next;
		while(cur != null){
			if(frontHalf.pop().data == cur.data)
				cur = cur.next;
			else
				return false;
		}
		return true;
	}
}
