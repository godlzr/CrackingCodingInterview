/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 4
 * 4.1 Implement a function to check if a binary tree is balanced. For the purposes of this question, 
 * a balanced tree is defined to be a tree such that the heights of 
 * the two subtrees of any node never differ by more than one.
 * isBalance()
 * 
 * 4.3 Given a sorted (increasing order) array with unique integer elements, 
 * write an algorithm to create a binary search tree with minimal height.
 * createMinHeightBST()
 * 
 * 4.4 Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth 
 * (e.g. if you have a tree with depth D, you'll have D linked lists).
 * 
 * 
 * 4.5 Implement a function to check if a binary tree is a binary search tree.
 * isBST()
 * 
 * 4.6 Write an algorithm to find the 'next' node(i.e., in-order successor) of a given node in a binary search tree. 
 * You may assume that each node has a link to its parent.
 * getSccessor()
 * 
 * 4.7 Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. 
 * Avoid storing additional nodes in a structure. NOTE: This is not necessarily a binary search tree.
 * getFirstCommonAncestor()
 */
package com.DataStructures.TreeGraph;

import com.DataStructures.TreeGraph.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.Map;
public class BinaryTreeHelper<Number>{
	Vector<Integer> inOrderTraResult = new Vector<Integer>();
	
	Vector<Integer> depthList = new Vector<Integer>();
	int depth = 0;
	
	TreeNode minHeightBSTRoot;
	
	public Vector<Vector<TreeNode>> depthNodeList = new Vector<Vector<TreeNode>>();
	/*
	 * 4.1 Implement a function to check if a binary tree is balanced. For the purposes of this question, 
	 * a balanced tree is defined to be a tree such that the heights of 
	 * the two subtrees of any node never differ by more than one.
	 */
	public void getDepth(TreeNode root) {
		if(root == null)
			return;
		depth += 1;
		getDepth(root.lchild);
		if(root.lchild == null && root.rchild == null) {
			depthList.add(depth);
		}
		getDepth(root.rchild);
		depth -= 1;
	}
	public boolean isBalance(TreeNode root) {
		getDepth(root);
		int min = depthList.get(0), max = depthList.get(0);
		for(Iterator ite = depthList.iterator(); ite.hasNext();) {
			Integer val = (Integer)ite.next();
			if(val.intValue() > max)
				max = val.intValue();
			if(val.intValue() < min)
				min = val.intValue();
		}
		if ((max - min) <= 1)
			return true;
		else
			return false;
	}
	
	/*
	 * 4.3 Given a sorted (increasing order) array with unique integer elements, 
	 * write an algorithm to create a binary search tree with minimal height.
	 */
	public void createMinHeightBST(int[] sortArray, BiTree bt, int start, int end) {
		if(bt.root == null)
			return;
		int mid = (start + end) / 2;
		bt.root.data = sortArray[mid];
		if(start < mid) {
			BiTree lchild = new BiTree(0);
			bt.root.lchild = lchild.root;
			createMinHeightBST(sortArray, lchild, start, mid-1);
		}
		if(end > mid) {
			BiTree rchild = new BiTree(0);
			bt.root.rchild = rchild.root;
			createMinHeightBST(sortArray, rchild, mid+1, end);
		}
	}
	/*
	 * 4.4 Given a binary tree, design an algorithm which creates 
	 * a linked list of all the nodes at each depth 
	 * (e.g. if you have a tree with depth D, you'll have D linked lists).
	 */
	public void getDepthNodeList(TreeNode root) {
		if(root == null)
			return;
		
		while(depthNodeList.size()<=depth) {
			Vector<TreeNode> equalDepthNodeList = new Vector<TreeNode>();
			depthNodeList.add(equalDepthNodeList);
		}
		depthNodeList.get(depth).add(root);
		depth += 1;
		getDepthNodeList(root.lchild);
		getDepthNodeList(root.rchild);
		depth -= 1;
	}
	
	/*
	 * 4.5 Implement a function to check if a binary tree is a binary search tree.
	 */
	public boolean isBST(TreeNode root) {
		this.InOrderTraverse(root);
		for(int i = 0; i < inOrderTraResult.size()-1; i++) {
			if(inOrderTraResult.get(i) > inOrderTraResult.get(i+1))
				return false;
		}
		return true;
	}
	public void InOrderTraverse(TreeNode root) {
		if(root == null)
			return;
		InOrderTraverse(root.lchild);
		inOrderTraResult.add(root.data);
		InOrderTraverse(root.rchild);
	}
	
	/*
	 * 4.6 Write an algorithm to find the 'next' node(i.e., in-order successor) 
	 * of a given node in a binary search tree. You may assume that each node has a link to its parent.
	 */
	public TreeNode getSccessor(TreeNode head) {
		if(head == null)
			return null;
		if(head.rchild != null) {
			return getChildSccessor(head.rchild);
		}else 
			return getParentSccessor(head);
	}
	
	public TreeNode getChildSccessor(TreeNode head) {
		while(head.lchild != null) {
			head = head.lchild;
		}
		return head;
	}
	public TreeNode getParentSccessor(TreeNode head) {
		int curValue = head.data;
		head = head.parent;
		while(head.data < curValue) {
			head = head.parent;
		}
		return head;
	}
	
	/*
	 * 4.7 Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. 
	 * Avoid storing additional nodes in a structure. NOTE: This is not necessarily a binary search tree.
	 * O(n) hashmap O(1), map(red black tree) O(logn)
	 */
	
	public TreeNode getFirstCommonAncestor(TreeNode n1, TreeNode n2) {
		if(n1 == null || n2 == null)
			return null;
		HashMap<TreeNode, Boolean> ancestorMap = new HashMap<TreeNode, Boolean>();
		while(n1.parent != null) {
			ancestorMap.put(n1.parent, true);
			n1 = n1.parent;
		}
		while(n2.parent != null) {
			if(ancestorMap.containsKey(n2.parent))
				break;
			n2 = n2.parent;
		}
		return n2.parent;
	}
	
}
