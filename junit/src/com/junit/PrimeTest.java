package com.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
	
	Prime p;
	@Before
	public void init()
	{
		p=new Prime();
	}


	@Test
	public void test() {
		assertEquals(true,p.pnc(5));
	}

}
