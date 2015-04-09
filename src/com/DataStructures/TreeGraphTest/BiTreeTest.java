package com.DataStructures.TreeGraphTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.TreeGraph.*;
public class BiTreeTest {

	@Test
	public void test() {
		BiTree btree = new BiTree(1);
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
		System.out.print(biTreeHelper.isBST(btree.root));
		
	}

}
