package com.DataStructures.TreeGraph;

import com.DataStructures.TreeGraph.*;

import java.util.Iterator;
import java.util.Vector;;
public class BinaryTreeHelper<Number>{
	Vector<Integer> inOrderTraResult = new Vector<Integer>();
	
	public void InOrderTraverse(TreeNode root) {
		if(root == null)
			return;
		InOrderTraverse(root.lchild);
		inOrderTraResult.add(root.data);
		InOrderTraverse(root.rchild);
	}
	public boolean isBST(TreeNode root) {
		this.InOrderTraverse(root);
		for(int i = 0; i < inOrderTraResult.size()-1; i++) {
			if(inOrderTraResult.get(i) > inOrderTraResult.get(i+1))
				return false;
		}
		return true;
	}
}
