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
		/*      		    R8	
		 * 				/		\
		 * 			 A4		  	      B12
		 * 		/		\			/	\
		 * 		C2		D6			E10	  F14
		 *  /	\	  /	 \		/	\	/	\
		 * G1	H3	 I5	  J 7	K9	 L11  M 13   N15
		 */
		/*TreeNode a = new TreeNode(4);
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
		/*      		    R8	
		 * 				/		   \
		 * 			 A4		  	      B12
		 * 		/		\			/	\
		 * 		C2		D6			E10	  F14
		 *  /	\	  /	 \		/		
		 * G1	H3	 I5	  J 7	K9
		 * 			/
		 * 			L11
		 * 			 \
		 * 			  M	13	  
		 */
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
		root.lchild = a;
		a.parent = root;
		root.rchild = b;
		b.parent = root;
		a.lchild = c;
		c.parent = a;
		a.rchild = d;
		b.parent = a;
		b.lchild = e;
		d.parent = a;
		e.parent = b;
		b.rchild = f;
		f.parent = b;
		c.lchild = g;
		g.parent = c;
		c.rchild = h;
		h.parent = c;
		d.lchild = i;
		i.parent = d;
		d.rchild = j;
		j.parent = d;
		e.lchild = k;
		k.parent = e;
		i.lchild = l;
		l.parent = i;
		l.rchild = m;
		m.parent = l;

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
