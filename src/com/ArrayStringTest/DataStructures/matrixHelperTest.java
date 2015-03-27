package com.ArrayStringTest.DataStructures;

import static org.junit.Assert.*;

import org.junit.Test;
import com.ArrayString.DataStructures.*;
public class matrixHelperTest {

	@Test
	public void test() {
		int[][] matrix = {{1,1,2,3,0,4},{2,1,0,0,2,1},{0,1,5,3,6,2},{1,2,3,5,6,3},{2,3,5,6,0,5}};
		System.out.println("Original matrix:");
		matrixHelper mh = new matrixHelper();
		mh.matrixPrinter(matrix);
		mh.setZero(matrix);
		System.out.println("Set zero matrix:");
		mh.matrixPrinter(matrix);
		
	}

}
