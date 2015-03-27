/*
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 1
 *
 * 1.6 Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. 
 * Can you do this in place?
 * matrixRotate()
 * 
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to 0.
 * setZero()
 */

package com.ArrayString.DataStructures;

public class matrixHelper {
/*
 * 1.6 Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. 
 * Can you do this in place?
 */
	public void matrixRotate(int[][] matrix) {}
/*
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to 0.
 */
	public void setZero(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		boolean[] colZero = new boolean[col];
		for(int i=0; i<col; i++)
			colZero[i] = false;
		boolean[] rowZero = new boolean[row];
		for(int i=0; i<row; i++)
			rowZero[i] = false;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(matrix[i][j] == 0) {
					colZero[j] = true;
					rowZero[i] = true;
				}
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(rowZero[i]||colZero[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public void matrixPrinter(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
