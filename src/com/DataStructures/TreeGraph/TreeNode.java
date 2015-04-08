package com.DataStructures.TreeGraph;

public class TreeNode<T> {
	T data;
	TreeNode lchild,rchild;
	
	TreeNode(T d) {
		data = d;
		lchild = null;
		rchild = null;
	}
}
