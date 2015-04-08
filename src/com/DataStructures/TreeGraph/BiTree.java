package com.DataStructures.TreeGraph;
import com.DataStructures.TreeGraph.TreeNode;
public class BiTree<T> {
	public TreeNode<T> root;
	
	public BiTree(){}
	
	public BiTree(T d) {
		TreeNode root = new TreeNode<T>(d);
		this.root = root;
	}
	
	public void createBiTree() {
		TreeNode a = new TreeNode('A');
		TreeNode b = new TreeNode('B');
		TreeNode c = new TreeNode('C');
		TreeNode d = new TreeNode('D');
		TreeNode e = new TreeNode('E');
		TreeNode f = new TreeNode('F');
		TreeNode g = new TreeNode('G');
		TreeNode h = new TreeNode('H');
		TreeNode i = new TreeNode('I');
		TreeNode j = new TreeNode('J');
		TreeNode k = new TreeNode('K');
		TreeNode l = new TreeNode('L');
		TreeNode m = new TreeNode('M');
		TreeNode n = new TreeNode('N');
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
