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
 * 
 * 
 * 1.5Implement a method to perform basic string compression using the 
 * counts of repeated characters. For example, the string aabccccccaaa would become a2b1c5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * you method should return the original string.
 * stringCompression()
 * 
 * 1.8 Assume you have a method isSubstring( ) which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isString( ) 
 * (e.g., "waterbottle" is a rotation of "erbottlewat").
 * isRotate()
 */
 

package com.DataStructures.ArrayString;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Character;
public class stringHelper {
	
	/*
	 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
	 * What if you cannot use additional data structures?
	 * O(n)
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
	 * O(1)
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
	 * O(n)
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
	
	/*
	 * 1.5Implement a method to perform basic string compression using the 
	 * counts of repeated characters. For example, the string aabccccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, 
	 * you method should return the original string.
	 * O(n)
	 */
	public String stringCompression(String str) {
		if(str.isEmpty())
			return str;
		
		int difChar = 1;
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1) != str.charAt(i))
				difChar ++;
		}
		
		int newStrLen = difChar*2;
		
		if(newStrLen >= str.length()) {
			
			return str;
			
		} else {
			
			StringBuffer newstr = new StringBuffer();
			int count = 1;
			char cur = str.charAt(0);
			int j = 0;
			
			for(int i=1; i<str.length(); i++) {
				
				if(cur!=str.charAt(i)) {
					
					newstr.append(cur);
					newstr.append(count);
					cur = str.charAt(i);
					count = 1;
					
				}else
					count++;
			}
			
			newstr.append(cur);
			newstr.append(count);
			return newstr.toString();
		}
	}
/*
 * 1.8 Assume you have a method isSubstring( ) which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isString( ) 
 * (e.g., "waterbottle" is a rotation of "erbottlewat").
 * O(1)
 */
	public boolean isRotate(String s1, String s2) {
		String newStr = s1 + s1;
		return isContain(newStr,s2);
	}
	public boolean isContain(String s1, String s2) {
		if(s1.contains(s2))
			return true;
		else
			return false;
	}
}

