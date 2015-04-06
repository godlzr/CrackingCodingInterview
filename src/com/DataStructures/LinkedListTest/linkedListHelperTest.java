package com.DataStructures.LinkedListTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DataStructures.ArrayString.*;
import com.DataStructures.LinkedList.linkedListHelper;

import java.util.*;
import com.DataStructures.LinkedList.*;

public class linkedListHelperTest {

	@Test
	public void test() {
		
		linkedListHelper listHelper = new linkedListHelper();
		
		/*singlyLinkedListNode list = new singlyLinkedListNode(1);
		
		list.appendToTail(1);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(4);
		list.appendToTail(5);
		list.appendToTail(2);
		list.appendToTail(1);
		list.appendToTail(6);
		list.appendToTail(4);
		singlyLinkedListNode c = list.next.next.next.next.next.next.next.next.next;
		System.out.print("Original List:");
		listHelper.linkedlistPrinter(list);
		/*System.out.println();
		listHelper.duplicateRemovelNobuffer(list);
		System.out.print("Processed List:");
		System.out.println();
		//listHelper.deleteMidElement(c);
		
		//listHelper.linkeListNodePrinter(listHelper.getElementDoublePtr(list,11));
		//listHelper.linkeListNodePrinter(listHelper.getElementRecursive(list,2));
		listHelper.linkedlistPrinter(listHelper.listPartition(list, 3));*/
		//System.out.print("the last Kth element is:");
		//System.out.print(listHelper.getElement(list, 3));
		
		/*singlyLinkedListNode s1 = new singlyLinkedListNode(7);
		s1.appendToTail(6);
		s1.appendToTail(3);
		s1.appendToTail(2);
		singlyLinkedListNode s2 = new singlyLinkedListNode(3);
		s2.appendToTail(2);
		s2.appendToTail(4);*/
		/*singlyLinkedListNode s = new singlyLinkedListNode(1);
		s.appendToTail(2);
		s.appendToTail(3);
		s.appendToTail(4);
		s.appendToTail(5);
		s.appendToTail(6);
		s.appendToTail(6);
		s.appendToTail(5);
		s.appendToTail(4);
		s.appendToTail(3);
		s.appendToTail(2);
		s.appendToTail(1);*/
		singlyLinkedListNode circle = new singlyLinkedListNode(1);
		circle.appendToTail(2);
		circle.appendToTail(3);
		circle.appendToTail(4);
		circle.appendToTail(5);
		circle.appendToTail(6);
		circle.appendToTail(7);
		circle.appendToTail(8);
		circle.appendToTail(9);
		circle.appendToTail(0);
		singlyLinkedListNode forthNode = circle.next.next;
		singlyLinkedListNode endNode = circle.next.next.next.next.next.next.next.next.next;
		endNode.next = forthNode;
		singlyLinkedListNode entry = listHelper.getFirstNodeOfCircle(circle);
		//listHelper.linkedlistPrinter(circle);
		System.out.print(entry.data);
	}

}
