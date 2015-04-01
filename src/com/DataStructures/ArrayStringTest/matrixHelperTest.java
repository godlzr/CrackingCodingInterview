package com.DataStructures.ArrayStringTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DataStructures.ArrayString.*;
public class matrixHelperTest {

	@Test
	public void test() {
		matrixHelper mh = new matrixHelper();
		/*int[][] matrix = {{1,1,2,3,0,4},{2,1,0,0,2,1},{0,1,5,3,6,2},{1,2,3,5,6,3},{2,3,5,6,0,5}};
		System.out.println("Original matrix:");
		
		mh.matrixPrinter(matrix);
		mh.setZero(matrix);
		System.out.println("Set zero matrix:");
		mh.matrixPrinter(matrix);*/
		int[][] matrix  = {{11,21,31,41,51},{12,22,32,42,52},{13,23,33,43,53},{14,24,34,44,54},{15,25,35,45,55}};
		System.out.println("Original matrix:");
		mh.matrixPrinter(matrix);
		
		mh.matrixRotate(matrix);
		System.out.println("Set zero matrix:");
		mh.matrixPrinter(matrix);
		
	}

}
