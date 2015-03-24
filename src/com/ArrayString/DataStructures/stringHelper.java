/*
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Data Structures
 * Chapter 1
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * boolean uniqueCharacter(String s);
 * 
 */

package com.ArrayString.DataStructures;

public class stringHelper {
	
	public boolean uniqueCharacter(String s) {
/*
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 */
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

}

