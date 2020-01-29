package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stringex {

	@Test
	public void test() {
		String[] exp= {"apple"};
		String[] act= {"apple"};
		assertArrayEquals(exp,act);
	}

}
