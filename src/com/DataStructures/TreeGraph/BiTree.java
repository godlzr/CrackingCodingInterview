package com.DataStructures.TreeGraph;
import com.DataStructures.TreeGraph.TreeNode;
public class BiTree {
	public TreeNode root;
	
	public BiTree(){}
	
	public BiTree(int d) {
		TreeNode root = new TreeNode(d);
		this.root = root;
	}
	
	public void createBiTree() {
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(12);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(6);
		TreeNode e = new TreeNode(10);
		TreeNode f = new TreeNode(14);
		TreeNode g = new TreeNode(1);
		TreeNode h = new TreeNode(3);
		TreeNode i = new TreeNode(5);
		TreeNode j = new TreeNode(7);
		TreeNode k = new TreeNode(9);
		TreeNode l = new TreeNode(11);
		TreeNode m = new TreeNode(13);
		TreeNode n = new TreeNode(15);
		root.lchild = a;
		root.rchild = b;
		a.lchild = c;
		a.rchild = d;
		b.lchild = e;
		b.rchild = f;
		c.lchild = g;
		c.rchild = h;
		d.lchild = i;
		d.rchild = j;
		e.lchild = k;
		e.rchild = l;
		f.lchild = m;
		f.rchild = n;
	}
	
	public void PreOrderTraverse(TreeNode root) {
		if(root == null)
			return;
		System.out.println(root.data);
		PreOrderTraverse(root.lchild);
		PreOrderTraverse(root.rchild);
	}
	public void InOrderTraverse(TreeNode root) {
		if(root == null)
			return;
		InOrderTraverse(root.lchild);
		System.out.println(root.data);
		InOrderTraverse(root.rchild);
	}
	public void PostOrderTraverse(TreeNode root) {
		if(root == null)
			return;
		PostOrderTraverse(root.lchild);
		PostOrderTraverse(root.rchild);
		System.out.println(root.data);
	}
}
