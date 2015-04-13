package com.DataStructures.TreeGraphTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.TreeGraph.*;
import java.util.Vector;
public class BiTreeTest {
	
	@Test
	public void test() {
		BiTree btree = new BiTree(8);
		btree.createBiTree();
		/*      		    R8	
		 * 				/		\
		 * 			 A4		  	      B12
		 * 		/		\			/	\
		 * 		C2		D6			E10	  F14
		 *  /	\	  /	 \		/	\	/	\
		 * G1	H3	 I5	  J 7	K9	 L11  M 13   N15
		 */
		//btree.InOrderTraverse(btree.root);
		BinaryTreeHelper biTreeHelper = new BinaryTreeHelper();
		//System.out.print(biTreeHelper.isBST(btree.root));
		/*      		    R8	
		 * 				/		\
		 * 			 A4		  	      B12
		 * 		/		\			/	\
		 * 		C2		D6			E10	  F14
		 *  /	\	  /	 \		/		
		 * G1	H3	 I5	  J 7	K9
		 * 			/
		 * 			L
		 * 			 \
		 * 			  M		  
		 */
		//System.out.print(biTreeHelper.isBalance(btree.root));
		
		/*int[] treeNodeArray = {1,2,3,4,5,6,7,8,9,10,11};
		BiTree bt = new BiTree(0);
		biTreeHelper.createMinHeightBST(treeNodeArray, bt, 0, 9);
		bt.PostOrderTraverse(bt.root);*/
		
		/*biTreeHelper.getDepthNodeList(btree.root);
		for(int i = 0; i<biTreeHelper.depthNodeList.size(); i++) {
			Vector<TreeNode> cur = (Vector<TreeNode>)biTreeHelper.depthNodeList.get(i);
			for(int j = 0; j<cur.size(); j++) {
				TreeNode curNode = (TreeNode)cur.get(j);
				System.out.print(curNode.data + " ");
			}
			System.out.println();
		}*/
		/*TreeNode n1 = btree.root.lchild.rchild.rchild;
		TreeNode min = biTreeHelper.getSccessor(test);
		System.out.print(min.data);*/
		TreeNode g = btree.root.lchild.lchild.lchild;
		TreeNode i = btree.root.lchild.rchild.lchild;
		TreeNode ancestor = biTreeHelper.getFirstCommonAncestor(g, i);
		System.out.print(ancestor.data);
		
	}

}
