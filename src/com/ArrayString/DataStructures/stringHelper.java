/*
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 1
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * uniqueCharacter()
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other.
 * isPermutatio()
 */

package com.ArrayString.DataStructures;
import java.util.Arrays;
public class stringHelper {
	
	/*
	 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
	 * What if you cannot use additional data structures?
	 */
	public boolean uniqueCharacter(String s) {

		boolean a[];
		
		a = new boolean[256];
		
		int strLength = s.length();
		
		for(int i=0; i<strLength; i++){
			
			int cha = s.charAt(i);
			
			if(a[cha]==false)
				a[cha] = true;
			else
				return false;
		}
		
		return true;
		
	}
	/*
	 * 1.3 Given two strings, write a method to decide if one is a permutation of the other.
	 */
	public boolean isPermutation(String a, String b) {
		
		char[] aStrtoChar = a.toCharArray();
		char[] bStrtoChar = b.toCharArray();
		Arrays.sort(aStrtoChar);
		Arrays.sort(bStrtoChar);
		
		if(Arrays.equals(aStrtoChar,bStrtoChar))
			return true;
		else
			return false;
	}

}

