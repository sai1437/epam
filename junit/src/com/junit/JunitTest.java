package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	
	Junit j;
	
	@Before
	public void init()
	{
		j=new Junit();
	}

	@Test
	public void test() {
		
		assertEquals("eligible to vote",j.election(33));
	}
	@Test
	public void test1() {
			
		assertEquals("eligible to vote",j.election(23));
	}
	

}
