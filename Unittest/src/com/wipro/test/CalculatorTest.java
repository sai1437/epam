package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2,3));
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals(-1,c.sub(2,3));
	}

}
