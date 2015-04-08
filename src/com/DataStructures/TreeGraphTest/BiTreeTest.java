package com.DataStructures.TreeGraphTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.TreeGraph.*;
public class BiTreeTest {

	@Test
	public void test() {
		BiTree btree = new BiTree('R');
		btree.createBiTree();
		/*      		    R	
		 * 				/		\
		 * 			 A		  	      B
		 * 		/		\			/	\
		 * 		C		D			E	  F
		 *  /	\	  /	 \		/	\	/	\
		 * G	H	 I	  J 	K	 L  M    N
		 */
		btree.PostOrderTraverse(btree.root);
		
	}

}
