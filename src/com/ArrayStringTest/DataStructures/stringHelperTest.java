package com.ArrayStringTest.DataStructures;

import static org.junit.Assert.*;

import org.junit.Test;
import com.ArrayString.DataStructures.*;

public class stringHelperTest {

	@Test
	public void test() {
		
		stringHelper sh = new stringHelper();
		
		String a = "asdjfhlkawhelifuaslkdjbvlak";
		
		String b = "abcdefg^hijk*lmnopqrst123,./[]7895";
		
		assertEquals(sh.uniqueCharacter(b),true);
		
	}

}
