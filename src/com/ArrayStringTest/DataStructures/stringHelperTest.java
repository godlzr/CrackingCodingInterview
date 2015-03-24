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
		
		assertTrue(sh.isPermutation(a, b));
		
	}

}
