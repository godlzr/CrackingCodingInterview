/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * 
 * Data Structures
 * Chapter 3
 * 
 * Implementation of Stack class
 * 
 * 3.4 In the classic problem of the Towers of Hanoi, you have 3 towers and N disks f different sizes 
 * which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size 
 * from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk.
 * Write a program to move the disks from the first tower to the last using stacks.
 */ 
package com.DataStructures.StacksQueues;
import com.DataStructures.StacksQueues.Stack;
import java.lang.String;
import com.DataStructures.StacksQueues.HanoiPlate;
import java.math.*;
public class HanoiTower {
	Stack<HanoiPlate> left, mid, right;
	int level;
	HanoiPlate[] plates;
	
	public HanoiTower(int n) {
		left = new Stack<HanoiPlate>();
		mid = new Stack<HanoiPlate>();
		right = new Stack<HanoiPlate>();
		this.level = n;
		plates = new HanoiPlate[this.level];
		for(int i = this.level-1; i>=0; i--){
			plates[i] = new HanoiPlate(i+1);
			left.push(plates[i]);
		}
			
	}
	/****************core processing**********************/
	public void movePlate(int n, Stack<HanoiPlate> src, Stack<HanoiPlate> brg, Stack<HanoiPlate> dst){
		if(n <= 0) 
			return;
		// move the n-1 from left to mid(through right)
		movePlate(n-1,src, dst, brg);
		// move n from left to right
		moveBottom(src,dst);
		// move n-1 from mid to right(through left) 
		movePlate(n-1,brg,src,dst);
		
	}
	public void moveBottom(Stack<HanoiPlate> src, Stack<HanoiPlate> dst) {
		HanoiPlate plate= src.pop().data;
		dst.push(plate);
		this.printTowers();
	}
	
	public void HanoiApproach() {
		this.movePlate(this.level, this.left, this.mid, this.right);
	}
	/*************************************************/
	
	/*********************Hanoi Tower Printer************************/
	public void printTowers() {
		Stack<HanoiPlate> tmpleft = new Stack<HanoiPlate>();
		Stack<HanoiPlate> tmpmid = new Stack<HanoiPlate>();
		Stack<HanoiPlate> tmpright = new Stack<HanoiPlate>();
		
		System.out.println("---------Hanoi Tower----------");
		System.out.println();
		StringBuffer firstline = new StringBuffer();
		int k = 1;
		for(int i = 0; i<this.level*6; i++) {
			if(i%(2*this.level + 1) == 0) {
				firstline.append(k);
				k++;
			}
			else
				firstline.append('*');
		}
		System.out.println(firstline.toString());
		System.out.println();
		/***************************************************/
		int offset = this.level;
		for(int i =0; i< this.level; i++){
			Node<HanoiPlate> leftPlate = null, midPlate=null, rightPlate=null;
			if(left.length == (level - i)) {
				leftPlate = left.pop();
				tmpleft.push(leftPlate.data);
			}
			if(mid.length == (level - i)) {
				midPlate = mid.pop();
				tmpmid.push(midPlate.data);
			}
			if(right.length == (level - i)) {
				rightPlate = right.pop();
				tmpright.push(rightPlate.data);
			}
			/**************blank line***********************/
			StringBuffer allBlank = new StringBuffer();
			for(int j=0; j<2*level-1 ; j++) {
				if(j == level-1)
					allBlank.append('|');
				else
					allBlank.append(' ');
			}
			/*********************************************/
			//print left
			if(leftPlate == null)
				System.out.print(allBlank);
			else {
				StringBuffer bl = new StringBuffer();
				
				for(int j=0; j<(offset-leftPlate.data.size); j++)
					bl.append(' ');
			
				String blankl = bl.toString();
				System.out.print(blankl + leftPlate.data.img + blankl);
			}
			System.out.print(' ');
			//print mid
			if(midPlate == null)
				System.out.print(allBlank);
			else {
				StringBuffer bm = new StringBuffer();
				for(int j=0; j<(offset-midPlate.data.size); j++)
					bm.append(' ');
				String blankm = bm.toString();
				System.out.print(blankm + midPlate.data.img + blankm);
			}
				
			System.out.print(' ');
			//print right
			if(rightPlate == null)
				System.out.print(allBlank);
			else {
				StringBuffer br = new StringBuffer();
				for(int j=0; j<(offset-rightPlate.data.size); j++)
					br.append(' ');
				String blankr = br.toString();
				System.out.print(blankr + rightPlate.data.img + blankr);
			}
				
			//return
			System.out.println();
		}
		while(tmpleft.length != 0) {
			 left.push(tmpleft.pop().data);
		}
		while(tmpmid.length != 0) {
			 mid.push(tmpmid.pop().data);
		}
		while(tmpright.length != 0) {
			 right.push(tmpright.pop().data);
		}
	}
	
}
