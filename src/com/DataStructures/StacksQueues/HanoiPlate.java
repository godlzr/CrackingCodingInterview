package com.DataStructures.StacksQueues;

public class HanoiPlate {
	int size;
	String img;
	
	HanoiPlate(int _size) {
		this.size = _size;
		
		StringBuffer strbf = new StringBuffer();
		
		for(int j = 0; j < this.size; j++) {
			if(j >0) {
				strbf.append('-');
				strbf.append('o');
			}
			else 
				strbf.append('o');
		}
			
		img = strbf.toString();
	}
}
