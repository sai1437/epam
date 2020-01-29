package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Strex2 {

	@Test
	public void test() {
		String s1="abc";
		String s2="abc";
		assertSame(s1,s2);
	}

}
