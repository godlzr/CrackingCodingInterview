/*
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 1
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * uniqueCharacter()
 * 
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other.
 * isPermutatio()
 * 
 * 1.4 replace space of string with "%20"
 * replaceSpce()
 */

package com.ArrayString.DataStructures;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Character;
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
	/*
	 * 1.4 replace space of string with "%20"
	 */
	public char[] replaceSpace(char[] str) {
		if(str == null) {
			System.out.println("The char array is null");
			return null;
		}
		int length = Array.getLength(str);
		if(length == 0) {
			System.out.println("The char array is null");
			return null;
		}
		int spcNum = 0;
		for(int i=0; i<length; i++) {
			if(Character.isWhitespace(str[i]))
				spcNum++;
		}
		char[] newstr; 
		newstr = new char[length+2*spcNum];
		for(int i=0,j=0; i<length; i++,j++) {
			if(Character.isWhitespace(str[i])) {
				newstr[j] = '%';
				newstr[j+1] = '2';
				newstr[j+2] = '0';
				j +=2;			
			}else{
				newstr[j] = str[i];
			}
				
		}
		return newstr;
	}

}

