package com.DataStructures.ArrayStringTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DataStructures.ArrayString.*;

public class stringHelperTest {

	@Test
	public void test() {
		
		stringHelper sh = new stringHelper();
		
		String a = "5*gopqe";
		
		String b = "op*egq5";
		String cstr = "abcdefghikkkkkkkkkkkkkkkkkkkkkk";
		
		String s1 = "mynameisgodlzr";
		String s2 = "isgodlzrmyname";
		//assertEquals(sh.uniqueCharacter(b),true);
		//char[] str = {'m','y',' ','n','a','m','e',' ','i','s',' ','g','o','d','l','z','r'};
		//assertTrue(sh.isPermutation(a, b));
		
		//System.out.print(sh.stringCompression(cstr));
		assertTrue(sh.isRotate(s1, s2));
	}

}
