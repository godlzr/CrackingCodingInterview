package com.ArrayStringTest.DataStructures;

import static org.junit.Assert.*;

import org.junit.Test;
import com.ArrayString.DataStructures.*;

public class stringHelperTest {

	@Test
	public void test() {
		
		stringHelper sh = new stringHelper();
		
		String a = "5*gopqe";
		
		String b = "op*egq5";
		
		//assertEquals(sh.uniqueCharacter(b),true);
		char[] str = {'m','y',' ','n','a','m','e',' ','i','s',' ','g','o','d','l','z','r'};
		//assertTrue(sh.isPermutation(a, b));
		System.out.print(sh.replaceSpace(str));
	}

}
