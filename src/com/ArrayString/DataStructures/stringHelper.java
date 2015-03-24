package com.ArrayString.DataStructures;

public class stringHelper {
	
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

}

